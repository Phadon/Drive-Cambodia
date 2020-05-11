package com.phadon.drivecambodia;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment implements View.OnClickListener {
    private CallBacks mCallBacks;

    public interface CallBacks {
        void onCourseSelected(View view);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBacks = (CallBacks) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallBacks = null;
    }

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
        CourseCard cardLicenseA = new CourseCard(view.findViewById(R.id.license_a_card));
        CourseCard cardLicenseB = new CourseCard(view.findViewById(R.id.license_b_card));
        CourseCard cardLicenseCD = new CourseCard(view.findViewById(R.id.license_c_d_card));
        CourseCard cardLicenseE = new CourseCard(view.findViewById(R.id.license_e_card));

        Context context = getContext();
        cardLicenseA.setBackgroundColor(ContextCompat.getColor(context, R.color.yellow))
                .setCourseImage(R.drawable.ic_motorbike)
                .setText("Get your license type A.")
                .setOnClickListener(this);
        cardLicenseB.setBackgroundColor(ContextCompat.getColor(context, R.color.blue))
                .setCourseImage(R.drawable.ic_car)
                .setText("Get your license type B.")
                .setOnClickListener(this);
        cardLicenseCD.setBackgroundColor(ContextCompat.getColor(context, R.color.purple))
                .setCourseImage(R.drawable.ic_truck)
                .setText("Get your license type C & D.")
                .setOnClickListener(this);
        cardLicenseE.setBackgroundColor(ContextCompat.getColor(context, R.color.teal))
                .setCourseImage(R.drawable.ic_grid)
                .setText("Get your license type E.")
                .setOnClickListener(this);

        // TODO: implement a function to get the percentage of course completion
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.license_a_card:
                Toast.makeText(getContext(), "Clicked license A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.license_b_card:
                Toast.makeText(getContext(), "Clicked license B", Toast.LENGTH_SHORT).show();
                break;
            case R.id.license_c_d_card:
                Toast.makeText(getContext(), "Clicked license C&D", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getContext(), "Clicked license E", Toast.LENGTH_SHORT).show();
        }
    }
}
