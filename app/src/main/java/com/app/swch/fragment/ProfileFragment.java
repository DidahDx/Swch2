package com.app.swch.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.app.swch.R;


/* renamed from: ke.swch.fragment.ProfileFragment */
public class ProfileFragment extends Fragment {
    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
