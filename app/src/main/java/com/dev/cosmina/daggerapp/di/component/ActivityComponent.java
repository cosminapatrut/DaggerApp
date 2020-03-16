package com.dev.cosmina.daggerapp.di.component;

import com.dev.cosmina.daggerapp.di.module.ActivityModule;
import com.dev.cosmina.daggerapp.di.scope.ActivityScope;
import com.dev.cosmina.daggerapp.ui.main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);
}
