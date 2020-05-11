package com.phadon.drivecambodia;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class LicenseBFragment extends Fragment {

    public static LicenseBFragment newInstance() {

        Bundle args = new Bundle();

        LicenseBFragment fragment = new LicenseBFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
