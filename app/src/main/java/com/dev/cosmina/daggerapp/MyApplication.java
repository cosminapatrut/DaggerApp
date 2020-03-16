package com.dev.cosmina.daggerapp;


import android.app.Application;

import com.dev.cosmina.daggerapp.data.local.DatabaseService;
import com.dev.cosmina.daggerapp.data.remote.NetworkService;
import com.dev.cosmina.daggerapp.di.component.ApplicationComponent;
import com.dev.cosmina.daggerapp.di.component.DaggerApplicationComponent;
import com.dev.cosmina.daggerapp.di.module.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    public ApplicationComponent applicationComponent;

    @Inject
    NetworkService networkService;

    @Inject
    DatabaseService databaseService;

    @Override
    public void onCreate() {
        super.onCreate();
        getDependencies();
    }

    public void getDependencies() {
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
}