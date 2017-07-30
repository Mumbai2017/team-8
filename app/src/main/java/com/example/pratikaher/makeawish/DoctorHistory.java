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
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pratikaher on 29/07/17.
 */

public class DoctorHistory extends Fragment{

    List<String> childlist=new ArrayList<>();
    List<String> illness=new ArrayList<>();
    List<String> status=new ArrayList<>();
    List<String> date=new ArrayList<>();


    View layoutinflater;
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        childlist.clear();

        childlist.add("Siddanth");
        childlist.add("Parth");
        childlist.add("Jayesh");


//        Retrofit retrofit=new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl("http://13.126.178.24/")
//                .build();
//
//        APIService apiServiceClass=retrofit.create(APIService.class);
//
//        VolunteerPOJOClass volunteerPOJOClass=new VolunteerPOJOClass();
//        volunteerPOJOClass.setChildName("JOY");
//        volunteerPOJOClass.setDoctorName("DOB");
//
//        Call<VolunteerPOJOClass> getinfo=apiServiceClass.createUser(volunteerPOJOClass);
//
//        getinfo.enqueue(new Callback<VolunteerPOJOClass>() {
//            @Override
//            public void onResponse(Call<VolunteerPOJOClass> call, Response<VolunteerPOJOClass> response) {
//                Log.d("SUCCESS","success");
//            }
//
//            @Override
//            public void onFailure(Call<VolunteerPOJOClass> call, Throwable t) {
//                Log.d("Fail","Fail");
//
//            }
//        });

//                Retrofit retrofit=new Retrofit.Builder()
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl("http://13.126.178.24/")
//                .build();
//        APIService apiServiceClass=retrofit.create(APIService.class);
//
//        Call<List<BeerResponse>> call=apiServiceClass.getdata();
//        call.enqueue(new Callback<List<BeerResponse>>() {
//            @Override
//            public void onResponse(Call<List<BeerResponse>> call, Response<List<BeerResponse>> response) {
//               Log.d("THis",response.body().get(0).getBeers().get(0).getChildName());
//                Log.d("Succ","Succ");
//            }
//
//            @Override
//            public void onFailure(Call<List<BeerResponse>> call, Throwable t) {
//                Log.d("FAIL","fial");
//            }
//        });

        layoutinflater = inflater.inflate(R.layout.doctor_history, container, false);
        recyclerView=(RecyclerView) layoutinflater.findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        CustomAdapter adapter = new CustomAdapter(childlist);
        recyclerView.setAdapter(adapter);

        return layoutinflater;

    }
}
