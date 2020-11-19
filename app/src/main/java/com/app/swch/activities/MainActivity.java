package com.app.swch.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.app.swch.AuthAppCompatActivity;
import com.app.swch.R;


public class MainActivity extends AuthAppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideToolbar();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish();
            }
        }, 5000);
    }
}
