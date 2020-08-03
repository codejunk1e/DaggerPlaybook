package com.robin.daggersample.dagger.modules;

import com.robin.daggersample.dagger.scopes.AppLevelSingleton;
import com.robin.daggersample.model.Driver;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
    @AppLevelSingleton
    Driver provideDriver(){
        return  new Driver();
    }
}
