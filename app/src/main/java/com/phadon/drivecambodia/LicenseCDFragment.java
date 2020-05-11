package com.phadon.drivecambodia;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class LicenseCDFragment extends Fragment {
    public static LicenseCDFragment newInstance() {

        Bundle args = new Bundle();

        LicenseCDFragment fragment = new LicenseCDFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
