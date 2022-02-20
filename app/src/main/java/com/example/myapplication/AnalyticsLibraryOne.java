package com.example.myapplication;

public class AnalyticsLibraryOne implements AnalyticsObserver {
    @Override
    public void logEvent(String event) {
        System.out.println(MainActivity.LOG_TAG + " " + Thread.currentThread().getName() + " : " + "Analytics 1 " + event);
    }
}
