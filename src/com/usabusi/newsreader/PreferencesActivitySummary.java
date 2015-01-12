package com.usabusi.newsreader;


import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PreferencesActivitySummary extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new PreferencesFragmentSummary()).commit();

    }
}