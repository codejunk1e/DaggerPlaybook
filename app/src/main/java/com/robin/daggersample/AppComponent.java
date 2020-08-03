package com.robin.daggersample;

import com.robin.daggersample.dagger.modules.DriverModule;
import com.robin.daggersample.dagger.modules.V8EngineModule;
import com.robin.daggersample.dagger.scopes.AppLevelSingleton;
import com.robin.daggersample.model.Driver;

import dagger.Component;

@AppLevelSingleton
@Component(modules = {DriverModule.class})
public interface AppComponent {

    /*
    *   This is not needed when the Activity component in herits from the AppComponent.
    *   It merely serves to expose the driver module when it is a dependency relationship
    * */

    Driver getDriver();


    /*
    *   This is used to get an instance of the subcomponent. This is a factory method
    * */
    ActivityComponent getActivityComponent(V8EngineModule v8EngineModule);


    /*
    *   Used when all our subcomponent modules are abstract and we have to pass a runtime argument.
    *   This return a builder onto which we can pass params
    *
    *
    *     ActivityComponent.Builder getActivityComponentBuilder ();
     * */


    /*
    *   Alternative to Builder pattern.
    * Factories are used for must need arguments while builders are optional
    * */
    ActivityComponent.Factory getActivityComponentFactory ();
}
