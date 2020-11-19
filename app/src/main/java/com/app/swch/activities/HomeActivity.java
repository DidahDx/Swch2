package com.app.swch.activities;

import android.os.Bundle;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.app.swch.AuthAppCompatActivity;
import com.app.swch.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


/* renamed from: ke.swch.activities.HomeActivity */
public class HomeActivity extends AuthAppCompatActivity {
    /* access modifiers changed from: protected */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_home, R.id.navigation_profile).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController((BottomNavigationView) findViewById(R.id.nav_view), navController);
        hideToolbar();
    }
}
