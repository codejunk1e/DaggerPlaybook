package com.robin.daggersample.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class V8Engine implements Engine {
    private static final String TAG = "com.robin.TAG";
    private int horsePower;

    @Inject
    public V8Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String run() {
        String noise = "Vroom Vroom from a V8 engine. My horsePower is " + horsePower ;
        Log.d(TAG, noise);
        return noise;
    }
}
