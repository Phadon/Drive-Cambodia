package com.phadon.drivecambodia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class LicenseCDFragment extends Fragment {
    public static LicenseEFragment newInstance() {

        Bundle args = new Bundle();

        LicenseEFragment fragment = new LicenseEFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
