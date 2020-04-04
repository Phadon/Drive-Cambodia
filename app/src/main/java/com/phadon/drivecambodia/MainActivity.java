package com.phadon.drivecambodia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.google.android.material.appbar.AppBarLayout;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.phadon.drivecambodia.fragments.*;

public class MainActivity extends AppCompatActivity {

    int themeColor, themeColorDark;
    ViewPager mViewPager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppBarLayout appBar = findViewById(R.id.appbar);
        Toolbar toolBar = findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        context = this;
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        themeColor = sharedPrefs.getInt("accent_color_dialog", Color.parseColor("#2196f3"));
        appBar.setBackgroundColor(themeColor);
//        themeColorDark = GetDetails.getDarkColor(context, themeColor);
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        final SmartTabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setSelectedIndicatorColors(themeColorDark);
        tabLayout.setViewPager(mViewPager);
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new tabHome();
                case 1:
                    return new tabSkills();
                case 3:
                    return new tabTest();
                default:
                    return new tabSettings();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.home_title);
                case 1:
                    return getString(R.string.skills_title);
                case 2:
                    return getString(R.string.test_title);
                case 3:
                    return getString(R.string.settings_title);

            }
            return null;
        }
    }
}
