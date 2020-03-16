package com.dev.cosmina.daggerapp.ui.main;

import com.dev.cosmina.daggerapp.data.local.DatabaseService;
import com.dev.cosmina.daggerapp.data.remote.NetworkService;
import com.dev.cosmina.daggerapp.di.scope.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
