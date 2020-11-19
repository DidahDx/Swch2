package com.app.swch;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: ke.swch.AuthAppCompatActivity */
public abstract class AuthAppCompatActivity extends AppCompatActivity {
    public static void doToast(Context context, int resID) {
        Toast.makeText(context, resID, Toast.LENGTH_LONG).show();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    protected void hideToolbar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    protected void doToast(int resID) {
        doToast(this, resID);
    }
}
