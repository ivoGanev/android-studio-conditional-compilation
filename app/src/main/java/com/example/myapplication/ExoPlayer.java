package com.example.myapplication;

public class ExoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println(MainActivity.LOG_TAG + " " + Thread.currentThread().getName() + " : " + "Exo Player is playing!");
    }
}
