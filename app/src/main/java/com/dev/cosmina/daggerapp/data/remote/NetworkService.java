package com.dev.cosmina.daggerapp.data.remote;


import android.content.Context;

import com.dev.cosmina.daggerapp.di.qualifier.ApplicationContext;
import com.dev.cosmina.daggerapp.di.qualifier.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
@Singleton
public class NetworkService {

    private Context context;
    private String apiKey;

    @Inject
    public NetworkService(@ApplicationContext Context context,
                          @NetworkInfo String apiKey) {
        // do the initialisation here
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
