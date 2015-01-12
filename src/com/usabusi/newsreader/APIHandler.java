package com.usabusi.newsreader;

import retrofit.RestAdapter;
//http://www.coffeedrivendev.com/category/android/
//http://www.coffeedrivendev.com/easy-rest-in-android-with-retrofit/
//http://api.openweathermap.org/data/2.5/weather?q=San%20Francisco
/**
 * Created by JohnWong on 2014-10-03.
 */
//https://plus.google.com/+HenriqueRocha/posts/PAg7BeCgL5H
/*
http://rachelbaker.me/wp-json/posts
http://provost.wsu.edu/wp-json/posts/
https://bahamar-wp.reservationsite.net/wp-json/posts/
http://articles.rhapsodyofrealities.org/wp-json/posts
http://iphoneszereles.hu/wp-json/posts
http://gp-api.eve-images.de/wp-json.php/posts/

http://shereadstruth.com/  no json
*/
public class APIHandler {
    //private static final String API_URL = "http://articles.rhapsodyofrealities.org/";
    private static String API_URL;// = "http://www.wired.com/";
    private static RestAdapter restAdapter;
    public static void setUrl(String strUrl)
    {
        API_URL=strUrl;
        return;
    };
    private static RestAdapter getRestAdapter(){
        if(restAdapter==null){
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();
        }
        return restAdapter;
    }

    public static WPClientAPI getApiInterface(){

        // Create an instance of our API interface.
        WPClientAPI wpclientAPI =null;
        try {
            if(restAdapter==null){
                restAdapter=getRestAdapter();
            }
            wpclientAPI = restAdapter.create(WPClientAPI.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wpclientAPI;
    }

}