package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xcl6P3gK9ZjQEXCo20LyDDhg6ag3JlN7rTQaZfof")
                .clientKey("N6c0iC6GPwnEiXvSwp40is1QGzeZv6q1DcLBd2cQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
