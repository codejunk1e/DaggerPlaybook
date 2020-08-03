package com.robin.daggersample.model;

/*
* Assume the wheels is a third party class we cannot annotate
*
* */

import android.util.Log;

import javax.inject.Inject;
public class Wheels {
    private static final String TAG="Wheels";

    private Rims rims;
    private Tyres tyres;


    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
        Log.d(TAG, "Wheels: Wheels on!!!");
    }
}
