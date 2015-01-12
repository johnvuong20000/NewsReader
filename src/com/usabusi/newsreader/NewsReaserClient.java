package com.usabusi.newsreader;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

import retrofit.http.Path;
import retrofit.http.Query;
import com.usabusi.newsreader.PostList;
import com.usabusi.newsreader.WPPostsData;

/**
 * Created by vip on 11/23/14.
 */


public class NewsReaserClient {
    private static final String API_URL = "https://articles.rhapsodyofrealities.org";

//    static class Contributor {
//        String login;
//        int contributions;
//
//        @Override
//        public String toString() {
//            return login + ", " + contributions;
//        }
//
//    }

    interface NewsReaderAPI {
//        @GET("/repos/{owner}/{repo}/contributors")
//        List<Contributor> contributors(@Path("owner") String owner, @Path("repo") String repo);
//
//        @GET("/repos/{owner}/{repo}/contributors")
//        void             contributors(@Path("owner") String owner, @Path("repo") String repo, Callback<List<Contributor>> callback);

        @GET("/wp-json/posts")
            // void getPosts(@Query("q") String cities, Callback<Wppost> callback);
            // void getPosts(Callback<PostList> callback);
        void posts(Callback<List<WPPostsData>> callback);

    }

    public static void getPosts(Callback<List<WPPostsData>> callback) {
        // Create a very simple REST adapter which points the GitHub API
        // endpoint.
//        RestAdapter restAdapter = new RestAdapter.Builder().setServer(API_URL).build();
//
//        // Create an instance of our GitHub API interface.
//        NewsReaderAPI newsreader = restAdapter.create(NewsReaderAPI.class);
//
//        // Fetch and print a list of the contributors to this library.
//        newsreader.posts(callback);

    }
}
