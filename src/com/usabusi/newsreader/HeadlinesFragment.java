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

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.usabusi.newsreader.PostList;
import com.usabusi.newsreader.WPPostsData;


//https://github.com/square/retrofit/issues/354

/**
 * Fragment that displays the news headlines for a particular news category.
 *
 * This Fragment displays a list with the news headlines for a particular news category.
 * When an item is selected, it notifies the configured listener that a headlines was selected.
 */
public class HeadlinesFragment extends SwipeRefreshListFragment implements OnItemClickListener {

    private static final String LOG_TAG = HeadlinesFragment.class.getSimpleName();
    //private static final int LIST_ITEM_COUNT = 10;
    private WPPostsData mcurArticle;
    private List<WPPostsData> mcurPostDatas= new ArrayList<WPPostsData>();
    private String myserver1;
    //private String myadditionalurl;
    private static int miCurrPage=1;
    // The list of headlines that we are displaying
    //List<String> mHeadlinesList = new ArrayList<String>();

    // The list adapter for the list we are displaying
    //ArrayAdapter<String> mListAdapter;
    ArrayAdapter<WPPostsData> mDataadapter;
    // The listener we are to notify when a headline is selected
    OnHeadlineSelectedListener mHeadlineSelectedListener = null;

    /**
     * Represents a listener that will be notified of headline selections.
     */
    public interface OnHeadlineSelectedListener {
        /**
         * Called when a given headline is selected.
         * @param index the index of the selected headline.
         */
        public void onHeadlineSelected(int index);
    }

    /**
     * Default constructor required by framework.
     */
    public HeadlinesFragment() {
        super();
    }

    @Override
    public void onStart() {
        super.onStart();
        setListAdapter(mDataadapter);
        getListView().setOnItemClickListener(this);
        loadCategory(0);
    }
    private ListView mListView;

    public void callWPClientAPI(){
        WPClientAPI weatherAPI;
        APIHandler.setUrl(myserver1);
        weatherAPI = APIHandler.getApiInterface();
        //List<WPPostsData>>  wpcallback=new List<WPPostsData>();
        //weatherAPI.getWeatherCity(cityName.getText().toString(), new Callback<WeatherData>() {
        weatherAPI.getPosts( miCurrPage,new Callback<List<WPPostsData>>() {
            @Override
            public void success(List<WPPostsData> postsdatas, Response response) {
//                int iSize=postsdatas.size();
//                String outInt=Integer.toString(iSize);
//                String outStr="Data found! Posts number is "+outInt;
//                Toast.makeText(getActivity().getApplicationContext(),outStr, Toast.LENGTH_LONG).show();
               /* TextView text = (TextView) findViewById(R.id.Humidity);
                text.setText(arg0.main.humidity);
                TextView textNameInfo = (TextView) findViewById(R.id.NameInfo);
                textNameInfo.setText(arg0.name);
                TextView textsysView = (TextView) findViewById(R.id.sysView);
                textsysView.setText(arg0.sys.country);
                TextView textweatherMain = (TextView) findViewById(R.id.weatherMain);
                if (arg0.weather.size()>0) {
                    textweatherMain.setText(arg0.weather.get(0).main);
                    TextView textweatherDescript = (TextView) findViewById(R.id.weatherDescript);
                    textweatherDescript.setText(arg0.weather.get(0).description);
                }
                */

                /**
                 * Create an ArrayAdapter to contain the data for the ListView. Each item in the ListView
                 * uses the system-defined simple_list_item_1 layout that contains one TextView.
                 */
//                ListAdapter adapter = new ArrayAdapter<String>(
//                        getActivity(),
//                        android.R.layout.simple_list_item_1,
//                        android.R.id.text1,
//                        Cheeses.randomList(LIST_ITEM_COUNT));
                if (postsdatas != null) {
                    // Add the found streams to our array to render
                    mcurPostDatas.addAll(postsdatas);
                    mDataadapter.notifyDataSetChanged();
                    int iSize=mDataadapter.getCount();
                    String outInt=Integer.toString(iSize);
                    String outStr="consumeApiData! Posts number is "+outInt;
                    Toast.makeText(getActivity().getApplicationContext(),outStr, Toast.LENGTH_LONG).show();
                    miCurrPage++;
                }
            }
            @Override
            public void failure(RetrofitError  error) {
                String outStr=error.toString();
                Toast.makeText(getActivity().getApplicationContext(), outStr, Toast.LENGTH_LONG).show();
            }
        });
    }



//
//    Callback<List<WPPostsData>> callback = new Callback<List<WPPostsData>>() {
//        @Override
//        public void success(List<WPPostsData> postsdatas, Response response) {
//            int iSize=postsdatas.size();
//            String outInt=Integer.toString(iSize);
//            String outStr="Data found! Posts number is "+outInt;
//            Toast.makeText(getActivity().getApplicationContext(),outStr, Toast.LENGTH_LONG).show();
//            ArrayAdapter<WPPostsData> adapter = new ArrayAdapter<WPPostsData>(getActivity().getApplicationContext(),
//                    android.R.layout.simple_list_item_1, postsdatas);
//            //mListView.setAdapter(adapter);
//            setListAdapter(adapter);
//        }
//
//        @Override
//        public void failure(RetrofitError error) {
//            String outStr=error.toString();
//            Toast.makeText(getActivity().getApplicationContext(), outStr, Toast.LENGTH_LONG).show();
//        }
//    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Notify the system to allow an options menu for this fragment.
        //changed
        setHasOptionsMenu(true);
        //mListAdapter = new ArrayAdapter<String>(getActivity(), R.layout.headline_item, mHeadlinesList);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        myserver1=preferences.getString("server1", "http://www.wired.com/wp-json");
        //myadditionalurl=preferences.getString("feedaddtionalurl1","/wp-json/posts?page=");


        callWPClientAPI();
        mDataadapter = new ArrayAdapter<WPPostsData>(getActivity(), R.layout.headline_item, mcurPostDatas );
        //NewsReaserClient.getPosts(callback);

//        mDataadapter = new ArrayAdapter<WPPostsData>(getActivity(),
//                android.R.layout.simple_list_item_1, android.R.id.text1,mcurPostDatas);

        //mListView.setAdapter(adapter);
        //Set the adapter between the ListView and its backing data.
        setListAdapter(mDataadapter);
        /**
         * Implement {@link SwipeRefreshLayout.OnRefreshListener}. When users do the "swipe to
         * refresh" gesture, SwipeRefreshLayout invokes
         * {@link SwipeRefreshLayout.OnRefreshListener#onRefresh onRefresh()}. In
         * {@link SwipeRefreshLayout.OnRefreshListener#onRefresh onRefresh()}, call a method that
         * refreshes the content. Call the same method in response to the Refresh action from the
         * action bar.
         */
        setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i(LOG_TAG, "onRefresh called from SwipeRefreshLayout");
                initiateRefresh();
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
    }


    /**
     * Respond to the user's selection of the Refresh action item. Start the SwipeRefreshLayout
     * progress bar, then initiate the background task that refreshes the content.
     *
     * <p>A color scheme menu item used for demonstrating the use of SwipeRefreshLayout's color
     * scheme functionality. This kind of menu item should not be incorporated into your app,
     * it just to demonstrate the use of color. Instead you should choose a color scheme based
     * off of your application's branding.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_refresh:
                Log.i(LOG_TAG, "Refresh menu item selected");

                // We make sure that the SwipeRefreshLayout is displaying it's refreshing indicator
                if (!isRefreshing()) {
                    setRefreshing(true);
                }

                // Start our refresh background task
                initiateRefresh();
                return true;
            case R.id.menu_url:
                // Launch settings activity
                //http://stackoverflow.com/questions/15514831/starting-new-activity-from-listfragment-using-onlistitemclick
                // intent = new Intent(this, PreferencesActivitySummary.class);
                Intent i = new Intent(getActivity().getApplicationContext(), PreferencesActivitySummary.class);
                HeadlinesFragment.this.startActivity(i);
                return true;
            case R.id.menu_color_scheme_1:
                Log.i(LOG_TAG, "setColorScheme #1");
                item.setChecked(true);

                // Change the colors displayed by the SwipeRefreshLayout by providing it with 4
                // color resource ids
                setColorScheme(R.color.color_scheme_1_1, R.color.color_scheme_1_2,
                        R.color.color_scheme_1_3, R.color.color_scheme_1_4);
                return true;

            case R.id.menu_color_scheme_2:
                Log.i(LOG_TAG, "setColorScheme #2");
                item.setChecked(true);

                // Change the colors displayed by the SwipeRefreshLayout by providing it with 4
                // color resource ids
                setColorScheme(R.color.color_scheme_2_1, R.color.color_scheme_2_2,
                        R.color.color_scheme_2_3, R.color.color_scheme_2_4);
                return true;

            case R.id.menu_color_scheme_3:
                Log.i(LOG_TAG, "setColorScheme #3");
                item.setChecked(true);

                // Change the colors displayed by the SwipeRefreshLayout by providing it with 4
                // color resource ids
                setColorScheme(R.color.color_scheme_3_1, R.color.color_scheme_3_2,
                        R.color.color_scheme_3_3, R.color.color_scheme_3_4);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * By abstracting the refresh process to a single method, the app allows both the
     * SwipeGestureLayout onRefresh() method and the Refresh action item to refresh the content.
     */
    private void initiateRefresh() {
        Log.i(LOG_TAG, "initiateRefresh");

        /**
         * Execute the background task, which uses {@link android.os.AsyncTask} to load the data.
         */
        new DummyBackgroundTask().execute();
    }

//    @Override
//    public void onRefresh() {
//        new AsyncTask<Void, Void, Void>() {
//
//            @Override
//            protected Void doInBackground(Void... params) {
//                try {
//                    callWPClientAPI();//Thread.sleep(1*1000); //sleep 3 seconds
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
//
//            @Override
//            protected void onPostExecute(Void result) {
//                    super.onPostExecute(result);
//                    mListAdapter.notifyDataSetChanged();
//                    setRefreshing(false);
//            }
//
//        }.execute();
//    }

    /**
     * When the AsyncTask finishes, it calls onRefreshComplete(), which updates the data in the
     * ListAdapter and turns off the progress bar.
     */
    private void onRefreshComplete() {
        Log.i(LOG_TAG, "onRefreshComplete");

        // Remove all items from the ListAdapter, and then replace them with the new items
//        ArrayAdapter<String> adapter = (ArrayAdapter<String>) getListAdapter();
//        adapter.clear();
//        for (String cheese : result) {
//            adapter.add(cheese);
//        }

        // Stop the refreshing indicator
        setRefreshing(false);
    }

    /**
     * Dummy {@link AsyncTask} which simulates a long running task to fetch new cheeses.
     */
    private class DummyBackgroundTask extends AsyncTask<Void, Void, Void> {

        static final int TASK_DURATION = 3 * 1000; // 3 seconds

        @Override
        protected Void doInBackground(Void... params) {
            // Sleep for a small amount of time to simulate a background-task
//            try {
//                //Thread.sleep(TASK_DURATION);
                callWPClientAPI();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            // Return a new random list of cheeses
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            //mDataadapter.notifyDataSetChanged();
            // Tell the Fragment that the refresh has completed
            int iSize=mcurPostDatas.size();
            String outInt=Integer.toString(iSize);
            String outStr="Data found! Posts number is "+outInt;
            Toast.makeText(getActivity().getApplicationContext(),outStr, Toast.LENGTH_LONG).show();
            onRefreshComplete();
        }

    }

    /**
     * Sets the listener that should be notified of headline selection events.
     * @param listener the listener to notify.
     */
    public void setOnHeadlineSelectedListener(OnHeadlineSelectedListener listener) {
        mHeadlineSelectedListener = listener;
    }

    /**
     * Load and display the headlines for the given news category.
     * @param categoryIndex the index of the news category to display.
     */
    public void loadCategory(int categoryIndex) {
//        mHeadlinesList.clear();
//        int i;
//        NewsCategory cat = NewsSource.getInstance().getCategory(categoryIndex);
//        for (i = 0; i < cat.getArticleCount(); i++) {
//            mHeadlinesList.add(cat.getArticle(i).getHeadline());
//        }
        mDataadapter.notifyDataSetChanged();
    }

    /**
     * Handles a click on a headline.
     *
     * This causes the configured listener to be notified that a headline was selected.
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mHeadlineSelectedListener) {
            // Populate via the holder for speed
            mcurArticle = mcurPostDatas.get(position);
            mHeadlineSelectedListener.onHeadlineSelected(position);
        }
    }

    public String getCurrArticleURL(){
        if (mcurArticle!=null)
            return mcurArticle.getLink();
        else
            return null;
    }
    /** Sets choice mode for the list
     *
     * @param selectable whether list is to be selectable.
     */
    public void setSelectable(boolean selectable) {
        if (selectable) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
        else {
            getListView().setChoiceMode(ListView.CHOICE_MODE_NONE);
        }
    }
}
