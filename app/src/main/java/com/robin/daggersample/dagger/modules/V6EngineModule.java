package com.robin.daggersample.dagger.modules;

import com.robin.daggersample.model.Engine;
import com.robin.daggersample.model.V6Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class V6EngineModule {
/*
*
*
* This method is used when we have to input something at runtime and we want to use @Component.Builder and @BindsInstance
*
* @Binds
    abstract Engine bindsEngine (V6Engine v6Engine);
* ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
    @Binds
    abstract Engine bindsEngine (V6Engine v6Engine);
}
