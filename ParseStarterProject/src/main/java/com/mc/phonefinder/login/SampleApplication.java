package com.mc.phonefinder.login;

import android.app.Application;

import com.parse.Parse;

public class SampleApplication extends Application {

    @Override
    public void onCreate(){
        Parse.initialize(this, getString(R.string.parse_app_id), getString(R.string.parse_client_id));
    }
}