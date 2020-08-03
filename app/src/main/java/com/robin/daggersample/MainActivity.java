package com.robin.daggersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.robin.daggersample.dagger.modules.V8EngineModule;
import com.robin.daggersample.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textView);


    /*
            Getting Car instance

            CarComponent component = DaggerCarComponent.create();
            car = component.getCar();
            textView.setText(car.drive());

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            Working with inject so we can use field annotation and @Inject

            CarComponent component = DaggerCarComponent.create();
            component.inject(this);
            textView.setText(car.drive());

 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

           Working wth runtime params. Using the @Component.Builder and @Binds Instance  (V6 Engine Module)

            CarComponent component = DaggerCarComponent.builder()
            .setHorsePower(500)
            .setEngineCapacity(100).build();
            component.inject(this);
            textView.setText(car.drive());

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


            Working wth runtime params. Using the Module constructor (V8 Engine Module) -- Using @Component.Builder is preferred

            CarComponent component = DaggerCarComponent.builder()
                    .engineModule(new EngineModule(500)).build();

            component.inject(this);
            textView.setText(car.drive());


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            Using Sub-components and getting Activity component from App component.
            This assumes you have a non abstract module with a constructor and dependencies to be passed to it


        ActivityComponent component = ((App) getApplication())
                .getAppComponent()
                .getActivityComponent(new V8EngineModule());

        component.inject(this);
        textView.setText(car.drive());

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            Using @SubComponent.Builder


        ActivityComponent component = ((App) getApplication())
                .getAppComponent()
                .getActivityComponentBuilder()
                .setHorsePower(100)
                .setEngineCapacity(500)
                .build();

        component.inject(this);
        textView.setText(car.drive());

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            ActivityComponent component = ((App) getApplication())
            .getAppComponent()
            .getActivityComponentFactory().create(100, 500);


        component.inject(this);
        textView.setText(car.drive());

    */

        ActivityComponent component = ((App) getApplication())
                .getAppComponent()
                .getActivityComponentFactory().create(100, 500);


        component.inject(this);
        textView.setText(car.drive());
    }
}