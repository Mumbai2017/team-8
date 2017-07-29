package com.example.pratikaher.makeawish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratikaher on 30/07/17.
 */

public class DonorFeed extends Fragment{
    List<String> childlist=new ArrayList<>();

    View layoutinflater;
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        childlist.clear();
        childlist.add("123");
        childlist.add("bro");
        childlist.add("sarang");

        layoutinflater = inflater.inflate(R.layout.donorfeed, container, false);
        recyclerView=(RecyclerView) layoutinflater.findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        CustomAdapter adapter = new CustomAdapter(childlist,true,true);
        recyclerView.setAdapter(adapter);

        return layoutinflater;
    }


}
