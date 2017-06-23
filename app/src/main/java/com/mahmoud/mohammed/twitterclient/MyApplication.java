package com.mahmoud.mohammed.twitterclient;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by siko on 6/23/2017.
 */

public class MyApplication extends Application {
    private static final String TWITTER_KEY = "6RUJo4R2mMPJikHJpfTe6ettt";
    private static final String TWITTER_SECRET = "mKvtNI7OoIplAEeDVGkwcxgVcIJWU5AaNWYIEwWwasyqDLr38e";

    @Override
    public void onCreate() {
        super.onCreate();

        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET))
                .debug(true)
                .build();
        Twitter.initialize(config);
    }
}
