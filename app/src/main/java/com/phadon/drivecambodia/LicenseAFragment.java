package com.phadon.drivecambodia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class LicenseAFragment extends Fragment {

    public static LicenseAFragment newInstance() {

        Bundle args = new Bundle();

        LicenseAFragment fragment = new LicenseAFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_licence_a, container, false);
        return view;
    }
}
