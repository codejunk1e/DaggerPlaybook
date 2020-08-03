package com.robin.daggersample;

import android.app.Application;

import com.robin.daggersample.dagger.modules.DriverModule;

class App extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
