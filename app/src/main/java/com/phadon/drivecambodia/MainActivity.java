package com.phadon.drivecambodia;

import android.view.View;

import androidx.fragment.app.Fragment;

public class MainActivity extends SingleFragmentActivity implements MainFragment.CallBacks {

    @Override
    public Fragment createFragment() {
        return MainFragment.newInstance();
    }

    @Override
    public void onCourseSelected(View view) {
        Fragment newFragment;
        switch (view.getId()) {
            case R.id.license_a_card:
                newFragment = LicenseAFragment.newInstance();
                break;
            case R.id.license_b_card:
                newFragment = LicenseBFragment.newInstance();
                break;
            case R.id.license_c_d_card:
                newFragment = LicenseCDFragment.newInstance();
                break;
            default:
                newFragment = LicenseEFragment.newInstance();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, newFragment)
                .commit();
    }
}