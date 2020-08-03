package com.robin.daggersample.dagger.modules;

import com.robin.daggersample.model.Rims;
import com.robin.daggersample.model.Tyres;
import com.robin.daggersample.model.Wheels;

import dagger.Module;
import dagger.Provides;

/*
* Methods are static because dagger doesn't need to create it. The methods do not use any instance stuff
* Can make the class abstract so it doesn't get created by dagger
* */

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tyres provideTyres(){
        return new Tyres();
    }

    @Provides
    static Wheels provides(Rims rims, Tyres tyres){
        return new Wheels(rims, tyres);
    }
}
