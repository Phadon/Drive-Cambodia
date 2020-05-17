package com.phadon.drivecambodia;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public class LicenseActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context packageContext) {
        return new Intent(packageContext, LicenseActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        String extras = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        switch (extras) {
            case "License A":
                return LicenseAFragment.newInstance();
            case "License B":
                return LicenseBFragment.newInstance();
            case "License CD":
                return LicenseCDFragment.newInstance();
            default:
                return LicenseEFragment.newInstance();
        }
    }
}
