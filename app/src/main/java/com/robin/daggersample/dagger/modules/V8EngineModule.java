package com.robin.daggersample.dagger.modules;

import com.robin.daggersample.model.Engine;
import com.robin.daggersample.model.V8Engine;
import dagger.Module;
import dagger.Provides;

@Module
public class V8EngineModule {

    /*
    This method is used when we have to input something at runtime. We make a constructor for the module class
    and use @Provides instead of @Binds. DaggerCarComponent.create(); will not work and we have to use. V8Engine has no
   @Inject constructor method. because it has a constructor param. Method involves using a Module constructor.
   An alternative is using @Component.Builder and @BindsInstance

    DaggerCarComponent.builder()
                .engineModule(new EngineModule(500)).build();

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    int horsePower;

    public EngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesEngine(){
        Engine engine = new V8Engine(horsePower);
        engine.run();
        return  engine;
    }

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

   This Method is used when we are binding the interface directly to an implementation and V8Engine has a
   @Inject constructor method. The class must be abstract too though for better performance.

   @Binds
    abstract Engine bindEngine(V8Engine v8Engine);


*/

    int horsePower;


    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine providesEngine(V8Engine engine){
        engine.run();
        return  engine;
    }

}