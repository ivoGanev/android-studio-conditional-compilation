package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class AnalyticsBroadcaster {
    private List<AnalyticsObserver> analyticsObservers = new ArrayList<>();

    public void addObserver(AnalyticsObserver observer) {
        analyticsObservers.add(observer);
    }

    public void notifyObservers(String analyticsData) {
        analyticsObservers.forEach(observer -> observer.logEvent(analyticsData));
    }
}
