package com.usabusi.newsreader;
//http://www.coffeedrivendev.com/category/android/
//http://www.coffeedrivendev.com/easy-rest-in-android-with-retrofit/
//http://api.openweathermap.org/data/2.5/weather?q=San%20Francisco


//http://stackoverflow.com/questions/20312530/i-cant-load-open-weather-map-icons
//add .png file extension
//String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
//private static String IMG_URL = "http://openweathermap.org/img/w/";
//con = (HttpURLConnection) ( new URL(IMG_URL + code +".png")).openConnection();
////http://hl.altervista.org/split.php?http://tuttologico.altervista.org/wp-content/uploads/2013/12/weather.zip
//
//        Weather info and icon with cWeather command line tool and apple script
//        http://tuttologico.altervista.org/wp-content/uploads/2013/12/weather.zip
//        For only download cWeather tool http://tuttologico.altervista.org/cweather-il-meteo-da-terminale-con-osx/
//http://www.openweathermap.org/api
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//https://github.com/square/retrofit/issues/354

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.usabusi.newsreader.PostList;
import com.usabusi.newsreader.WPPostsData;
import java.util.List;

public class MainActivity extends Activity {

    //private StoryListAdapter mAdapter;
    private ListView mListView;

    public void callWPClientAPI(){
        WPClientAPI weatherAPI;
        weatherAPI = APIHandler.getApiInterface();
        //Callback<List<WPPostsData>>  wpcallback=new Callback<List<WPPostsData>>();
        //weatherAPI.getWeatherCity(cityName.getText().toString(), new Callback<WeatherData>() {
        weatherAPI.getPosts( new Callback<PostList>() {
            @Override
            public void success(final PostList arg0, Response arg1) {
                int iSize=arg0.size();
                String outInt=Integer.toString(iSize);
                String outStr="Data found! Posts number is "+outInt;
                Toast.makeText(getApplicationContext(),outStr, Toast.LENGTH_LONG).show();
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
            }
            @Override
            public void failure(RetrofitError arg0) {
                Toast.makeText(getApplicationContext(), arg0.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
        //https://www.google.com.hk/search?safe=active&client=firefox-a&hs=SYU&rls=org.mozilla%3Azh-CN%3Aofficial&q=retrofit+listview+setadapter+&oq=retrofit+listview+setadapter+&gs_l=serp.3...855945.862117.0.862958.14.12.2.0.0.1.291.1324.7j4j1.12.0....0...1c.1.55.serp..7.7.716.ltWU_CEeVhw
        //http://androidexample.com/Create_A_Simple_Listview_-_Android_Example/index.php?view=article_discription&aid=65&aaid=90
        //http://www.vogella.com/tutorials/AndroidListView/article.html
        //https://github.com/thecodepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
        // Get ListView object from xml
        mListView = (ListView) findViewById(R.id.list);
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
    /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        mListView.setAdapter(adapter);

        // ListView Item Click Listener
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) mListView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            };

            mListView.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {

                    // ListView Clicked item index
                    int itemPosition     = position;

                    // ListView Clicked item value
                    String  itemValue    = (String) mListView.getItemAtPosition(position);

                    // Show Alert
                    Toast.makeText(getApplicationContext(),
                            "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                            .show();

                }

            });


	*/

    callWPClientAPI();
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
}
