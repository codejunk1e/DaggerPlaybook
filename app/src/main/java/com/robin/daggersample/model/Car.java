package com.robin.daggersample.model;

import android.util.Log;

import com.robin.daggersample.dagger.scopes.ActivityLevelSingleton;

import javax.inject.Inject;

@ActivityLevelSingleton
public class Car {
    private static final String TAG= "com.robin.TAG";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String drive(){
        String engineNoise = "Vroom! Vroom! " + engine.run();
        Log.d(TAG, engineNoise);
        return  engineNoise;
    }
}
