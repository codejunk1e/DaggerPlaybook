package com.robin.daggersample.model;

import javax.inject.Inject;


/*
*  Assuming that the Engine is an inerface type and we have to swap out implementations
* */
public interface Engine {

    String run();

}
