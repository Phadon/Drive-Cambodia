package com.phadon.drivecambodia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class LicenseAFragment extends Fragment {

    public static LicenseEFragment newInstance() {

        Bundle args = new Bundle();

        LicenseEFragment fragment = new LicenseEFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_licence_a, container, false);
    }

    private class ModuleHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mModuleTitle;
        private ImageView mModuleIcon;

        public ModuleHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }

    private class ModuleAdapter extends RecyclerView.Adapter<ModuleHolder> {

        @NonNull
        @Override
        public ModuleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ModuleHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
