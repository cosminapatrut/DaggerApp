package com.dev.cosmina.daggerapp.di.component;


import com.dev.cosmina.daggerapp.di.module.FragmentModule;
import com.dev.cosmina.daggerapp.di.scope.FragmentScope;
import com.dev.cosmina.daggerapp.ui.home.HomeFragment;

import dagger.Component;

@FragmentScope
@Component(dependencies = {ApplicationComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(HomeFragment fragment);
}
