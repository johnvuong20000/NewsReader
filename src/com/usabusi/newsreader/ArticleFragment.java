/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.usabusi.newsreader;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Fragment that displays a news article.
 */
public class ArticleFragment extends Fragment {
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }
    // The webview where we display the article (our only view)
    WebView mWebView;

    // The article we are to display
    NewsArticle mNewsArticle = null;
    String mCurrArticleURL=null;
    // Parameterless constructor is needed by framework
    public ArticleFragment() {
        super();
    }

    /**
     * Sets up the UI. It consists if a single WebView.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mWebView = new WebView(getActivity());
//http://stackoverflow.com/questions/17259537/load-webview-from-cache
        WebSettings webSettings =mWebView.getSettings();
                // Enable JavaScript
        webSettings.setJavaScriptEnabled(true); // enable javascript
        mWebView.setHorizontalScrollBarEnabled(false);
        webSettings.setAppCacheMaxSize(5 * 1024 * 1024); // 5MB
        webSettings.setAppCachePath(getActivity().getApplicationContext().getCacheDir().getAbsolutePath());
        webSettings.setAllowFileAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT); // load online by default
//http://stackoverflow.com/questions/25161720/url-opened-in-browser-instead-of-web-view
        mWebView.setVisibility(View.VISIBLE);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setBuiltInZoomControls(true);

        //final Activity activity = this;
        // Make WebClient
        mWebView.setWebViewClient(new WebViewClient() {
            // Trace Errors
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getActivity().getApplicationContext(), description, Toast.LENGTH_SHORT).show();
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //http://developer.android.com/guide/webapps/webview.html#HandlingNavigation
//                view.loadUrl(url);
//                return true;
                return false;
            }
        });

        loadWebView();
        return mWebView;
    }

    /**
     * Displays a particular article.
     *
     * @param article the article to display
     */
    public void displayArticle(NewsArticle article) {
        mNewsArticle = article;
        loadWebView();
    }



    /**
     * Loads article data into the webview.
     *
     * This method is called internally to update the webview's contents to the appropriate
     * article's text.
     */
    void loadWebView() {
        if (mWebView != null) {
            //mWebView.loadData(mNewsArticle == null ? "" : mNewsArticle.getBody(), "text/html","utf-8");
            if (mCurrArticleURL!=null)
                mWebView.loadUrl(mCurrArticleURL);
            else{
                String nullHtml = "<html><body><h1>Nothing To Show, Make sure the link is OK</h1></body></html>";
                mWebView.loadData(nullHtml, "text/html","utf-8");
            }

        }
    }
    public String NullPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>" + "Nothing To Show, Make sure the link is OK" + "</h1>");
        sb.append("</body></html>");
        return sb.toString();
    }
    public void loadUrl(String  articleURL) {
        //mNewsArticle = article;
        mCurrArticleURL=articleURL;
        if (mWebView != null) {
            if ( !isNetworkAvailable() ) { // loading offline
                mWebView.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );
                //Toast.makeText(getActivity().getApplicationContext(), "Offline Cache Mode", Toast.LENGTH_SHORT).show();
             }
              mWebView.loadUrl(articleURL);
              //mWebview.loadUrl("http://divers.ommelandercollege.nl/webportalen/dagrooster.php");
        }
    }

}
