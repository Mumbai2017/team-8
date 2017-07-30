package com.example.pratikaher.makeawish;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by pratikaher on 29/07/17.
 */

public class VolunteerSide extends AppCompatActivity {


    FragmentManager manager = getSupportFragmentManager();

    //    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    VolunteerForm volunteerForm = new VolunteerForm();
    VoulteerFeed volunteerfeed=new VoulteerFeed();
    VolunteerDetails voulunteerprofile=new VolunteerDetails();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteermain);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        manager.beginTransaction().replace(R.id.home_fragment,volunteerfeed).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.volunteerfeed:
                                manager.beginTransaction().replace(R.id.home_fragment,volunteerfeed).commit();
                                break;

                            case R.id.volunteerform:
                                manager.beginTransaction().replace(R.id.home_fragment,volunteerForm).commit();
                                break;

                            case R.id.volunteerdetails:
                                manager.beginTransaction().replace(R.id.home_fragment,voulunteerprofile).commit();
                                break;
                        }
                        return true;
                    }
                });
    }
}
