package com.robin.daggersample;

import com.robin.daggersample.dagger.modules.V6EngineModule;
import com.robin.daggersample.dagger.modules.V8EngineModule;
import com.robin.daggersample.dagger.modules.WheelsModule;
import com.robin.daggersample.dagger.scopes.ActivityLevelSingleton;
import com.robin.daggersample.model.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityLevelSingleton
@Subcomponent( modules = {WheelsModule.class, V6EngineModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    Car getCar();

/*

    Using the @Component .Builder patter to inject runtime dependencies. Similar to regular Builder pattern


    @Component.Builder
    interface Builder{
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        *   Provides HorsePower Globally wherever @Inject is needed. Since both Horse Power and
        *   Engine Capacity are ints we have to use named params
        *

        @BindsInstance
        Builder setHorsePower(@Named("horse power") int horsePower);
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         *   Provides Engine Capacity Globally wherever @Inject is needed. Since both Horse Power and
         *   Engine Capacity are ints we have to use named params
         *

        @BindsInstance
        Builder setEngineCapacity(@Named("engine capacity") int engineCapacity);
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

         *   Used to set App component in the builder pattern when building with dependencies
         *

        Builder setAppComponent (AppComponent appComponent);
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         *   Used to return ActivityComponent when .build is called. This pattern is only necessary because @Component.Builder was overridden
         *

        ActivityComponent build();
    }
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         *   Used when Mosules are abstract or not concrete and we want to pass params

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder setHorsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder setEngineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    * Using a factory to pass arguments instead of a builder
    interface Factory{
        ActivityComponent create(
                @BindsInstance @Named("horse power") int horsePower,
                @BindsInstance @Named("engine capacity") int engineCapacity
        );
    }
*/


    interface Factory{
        ActivityComponent create(
                @BindsInstance @Named("horse power") int horsePower,
                @BindsInstance @Named("engine capacity") int engineCapacity
        );
    }
}
