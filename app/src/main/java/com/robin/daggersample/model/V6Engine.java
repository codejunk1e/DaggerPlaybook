package com.robin.daggersample.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class V6Engine implements Engine {
    private int horsePower;
    private int engineCap;

    private static final String TAG = "com.robin.TAG";

    @Inject
    public V6Engine(@Named("horse power")  int horsePower, @Named("engine capacity")  int engineCap) {
        this.horsePower = horsePower;
        this.engineCap = engineCap;

    }

    @Override
    public String run() {
        String noise = "from a V6 engine and horsePower is " +horsePower + " and engineCap " +engineCap;
        Log.d(TAG, noise);
        return noise;
    }
}
