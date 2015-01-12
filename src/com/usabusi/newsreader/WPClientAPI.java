package com.usabusi.newsreader;
//http://www.coffeedrivendev.com/category/android/
//http://www.coffeedrivendev.com/easy-rest-in-android-with-retrofit/
//http://api.openweathermap.org/data/2.5/weather?q=San%20Francisco
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import com.usabusi.newsreader.PostList;
import com.usabusi.newsreader.WPPostsData;
/**
 * Created by JohnWong on 2014-10-03.
 */
//http://rachelbaker.me/wp-json/posts?page=4
//http://articles.rhapsodyofrealities.org/wp-json/posts?page=3
//http://provost.wsu.edu/wp-json/posts?page=2
//https://bahamar-wp.reservationsite.net/wp-json/posts/
//https://bahamar-wp.reservationsite.net/wp-json/posts?page=3
//http://www.wired.com/wp-json/posts
    //http://www.citizenschools.org/wp-json/posts
    //http://megane-blog.com/wp-json/
    //http://www.luit.nl/wp-json/posts
//http://music.svague.net/wp-json/posts

// "/api/42/getDummieContent?test=test"
//@GET("/api/{id}/getDummieContent")
//public DummieContent getDummieContent(@Path("id") Integer id, @Query("test") String strTest);


public interface WPClientAPI {
    //private String myadditionalurl;
    @GET("/posts?page=")
   // void getPosts(@Query("q") String cities, Callback<Wppost> callback);
   // void getPosts(Callback<PostList> callback);
    void getPosts(@Query("page") int page,Callback<List<WPPostsData>>  callback);
}
