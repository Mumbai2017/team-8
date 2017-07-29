package com.example.pratikaher.makeawish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pratikaher on 29/07/17.
 */

public class VolunteerForm extends Fragment {
    View layoutinflater;
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutinflater=inflater.inflate(R.layout.volunteerform,container,false);

        return layoutinflater;
    }


}
