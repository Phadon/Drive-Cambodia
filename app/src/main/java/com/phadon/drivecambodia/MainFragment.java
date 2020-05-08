package com.phadon.drivecambodia;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    private CourseCard cardLicenseA, cardLicenseB, cardLicenseCD, cardLicenseE;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        setupCards(view);
        return view;
    }

    private void setupCards(View view) {
        cardLicenseA = new CourseCard(view.findViewById(R.id.license_a_card));
        cardLicenseB = new CourseCard(view.findViewById(R.id.license_b_card));
        cardLicenseCD = new CourseCard(view.findViewById(R.id.license_c_d_card));
        cardLicenseE = new CourseCard(view.findViewById(R.id.license_e_card));

        Context context = getContext();
        cardLicenseA.setBackgroundColor(ContextCompat.getColor(context, R.color.yellow));
        cardLicenseB.setBackgroundColor(ContextCompat.getColor(context, R.color.blue));
        cardLicenseCD.setBackgroundColor(ContextCompat.getColor(context, R.color.purple));
        cardLicenseE.setBackgroundColor(ContextCompat.getColor(context, R.color.teal));

        cardLicenseA.setCourseImage(R.drawable.ic_motorbike);
        cardLicenseB.setCourseImage(R.drawable.ic_car);
        cardLicenseCD.setCourseImage(R.drawable.ic_truck);
        cardLicenseE.setCourseImage(R.drawable.ic_grid);

        cardLicenseA.setText("Get your license type A.");
        cardLicenseB.setText("Get your license type B.");
        cardLicenseCD.setText("Get your license type C & D.");
        cardLicenseE.setText("Get your license type E.");
    }

}
