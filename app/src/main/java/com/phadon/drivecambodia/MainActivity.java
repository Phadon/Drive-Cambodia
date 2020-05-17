package com.phadon.drivecambodia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MainActivity extends SingleFragmentActivity implements MainFragment.CallBacks {

    @Override
    public Fragment createFragment() {
        return MainFragment.newInstance();
    }

    @Override
    public void onCourseSelected(View view) {
        Intent intent = LicenseActivity.newIntent(getApplicationContext());
        switch (view.getId()) {
            case R.id.license_a_card:
                intent.putExtra(Intent.EXTRA_TEXT, "License A");
                break;
            case R.id.license_b_card:
                intent.putExtra(Intent.EXTRA_TEXT, "License B");
                break;
            case R.id.license_c_d_card:
                intent.putExtra(Intent.EXTRA_TEXT, "License CD");
                break;
            default:
                intent.putExtra(Intent.EXTRA_TEXT, "License E");
        }
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}