package com.dev.cosmina.daggerapp.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;


@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface NetworkInfo {
}
