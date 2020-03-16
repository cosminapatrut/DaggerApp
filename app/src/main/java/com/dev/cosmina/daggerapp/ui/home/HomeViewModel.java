package com.dev.cosmina.daggerapp.ui.home;


import com.dev.cosmina.daggerapp.data.local.DatabaseService;
import com.dev.cosmina.daggerapp.data.remote.NetworkService;
import com.dev.cosmina.daggerapp.di.scope.FragmentScope;
import com.dev.cosmina.daggerapp.utils.NetworkHelper;

import javax.inject.Inject;

@FragmentScope
public class HomeViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;
    private NetworkHelper networkHelper;

    @Inject
    public HomeViewModel(DatabaseService databaseService,
                         NetworkService networkService,
                         NetworkHelper networkHelper) {
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }

    public String getSomeData() {
        return databaseService.getDummyData()
                + " : " + networkService.getDummyData()
                + " : " + networkHelper.isNetworkConnected();
    }
}
