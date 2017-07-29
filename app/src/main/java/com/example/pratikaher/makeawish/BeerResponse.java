package com.example.pratikaher.makeawish;

import com.example.pratikaher.makeawish.AllPOJO.VolunteerPOJOClass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pratikaher on 30/07/17.
 */

public class BeerResponse {

    @SerializedName("child")
    @Expose
    List<VolunteerPOJOClass> beers;

    public List<VolunteerPOJOClass> getBeers() {
        return beers;
    }

    public void setBeers(List<VolunteerPOJOClass> beers) {
        this.beers = beers;
    }
}
