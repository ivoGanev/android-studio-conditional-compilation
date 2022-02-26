package com.example.myapplication;

import com.google.android.exoplayer2.SimpleExoPlayer;

public class PlayerWrapper implements MediaPlayer {
    private SimpleExoPlayer exoPlayer;

    @Override
    public void play() {
        if (BuildConfig.FLAVOR.equals("variantA")) {
            exoPlayer.addListener(Pla);
        } else if (BuildConfig.FLAVOR.equals("variantB")) {

        }
    }

    @Override
    public void onError(String error) {

    }
}
