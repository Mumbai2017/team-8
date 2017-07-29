package com.example.pratikaher.makeawish;

import com.example.pratikaher.makeawish.AllPOJO.VolunteerPOJOClass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by pratikaher on 30/07/17.
 */

public interface APIService {

//    @GET("/cfg/fetch_child_no_wish.php")
//    public void getdata(Callback<BeerResponse> callback);

    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @POST("/users/newuser")
    Call<VolunteerPOJOClass> createUser(@Body VolunteerPOJOClass user);

}
