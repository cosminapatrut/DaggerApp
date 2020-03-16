package com.dev.cosmina.daggerapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dev.cosmina.daggerapp.MyApplication;
import com.dev.cosmina.daggerapp.R;
import com.dev.cosmina.daggerapp.di.component.DaggerActivityComponent;
import com.dev.cosmina.daggerapp.di.module.ActivityModule;
import com.dev.cosmina.daggerapp.ui.home.HomeFragment;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getDependencies();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvData = findViewById(R.id.tv_message);
        tvData.setText(viewModel.getSomeData());

        addHomeFragment();
    }

    private void addHomeFragment() {
        if(getSupportFragmentManager().findFragmentByTag(HomeFragment.TAG) == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                    .commit();
        }
    }

    private void getDependencies() {
        DaggerActivityComponent
                .builder()
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
    }
}
