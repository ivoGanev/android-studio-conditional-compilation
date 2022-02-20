package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = "MY_APPLICATION";

    private MediaPlayer mediaPlayer;
    private final AnalyticsBroadcaster analyticsBroadcaster = new AnalyticsBroadcaster();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(BuildConfig.ANALYTICS_1) {
            analyticsBroadcaster.addObserver(new AnalyticsLibraryOne());
        }

        if (BuildConfig.ANALYTICS_2) {
            analyticsBroadcaster.addObserver(new AnalyticsLibraryTwo());
        }

        if(BuildConfig.EXO_PLAYER) {
            mediaPlayer = new ExoPlayer();
        }

        if(mediaPlayer!=null) {
            mediaPlayer.play();
        }

        analyticsBroadcaster.notifyObservers("Hello!");

        /* Depending on flavor */
        System.out.println(MainActivity.LOG_TAG + " " + Thread.currentThread().getName() + " : " + "Website: " + getResources().getString(R.string.product_website));
    }
}