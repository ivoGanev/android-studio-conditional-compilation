package com.example.myapplication;

public class AnalyticsLibraryTwo implements AnalyticsObserver {
    @Override
    public void logEvent(String event) {
        System.out.println(MainActivity.LOG_TAG + " " + Thread.currentThread().getName() + " : " + "Analytics 2: " + event);
    }
}
