package com.example.pratikaher.makeawish;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pratikaher on 29/07/17.
 */

public class DoctorProfile extends Fragment{

    View layoutinflater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        layoutinflater = inflater.inflate(R.layout.doctor_details, container, false);

        return layoutinflater;
    }
}
