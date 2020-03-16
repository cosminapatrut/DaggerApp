package com.dev.cosmina.daggerapp.di.component;


import android.content.Context;

import com.dev.cosmina.daggerapp.MyApplication;
import com.dev.cosmina.daggerapp.data.local.DatabaseService;
import com.dev.cosmina.daggerapp.data.remote.NetworkService;
import com.dev.cosmina.daggerapp.di.module.ApplicationModule;
import com.dev.cosmina.daggerapp.di.qualifier.ApplicationContext;
import com.dev.cosmina.daggerapp.utils.NetworkHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

    @ApplicationContext
    Context getContext();

    NetworkService getNetworkService();

    DatabaseService getDatabaseService();

    NetworkHelper getNetworkHelper();
}
