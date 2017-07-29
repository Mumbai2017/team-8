package com.example.pratikaher.makeawish;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pratikaher.makeawish.AllPOJO.VolunteerPOJOClass;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pratikaher on 29/07/17.
 */

public class DoctorHistory extends Fragment{

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

        Retrofit retrofit=new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://13.126.178.24/")
                .build();

        APIService apiServiceClass=retrofit.create(APIService.class);

        apiServiceClass.getStreams().enqueue(new Callback<BeerResponse>() {
            @Override
            public void onResponse(Call<BeerResponse> call, Response<BeerResponse> response) {
               String s= response.body().getBeers().get(0).getParentId();
                Log.d("final",s);

            }

            @Override
            public void onFailure(Call<BeerResponse> call, Throwable t) {

            }
        });






        layoutinflater = inflater.inflate(R.layout.doctor_history, container, false);
        recyclerView=(RecyclerView) layoutinflater.findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        CustomAdapter adapter = new CustomAdapter(childlist);
        recyclerView.setAdapter(adapter);

        return layoutinflater;

    }
}
