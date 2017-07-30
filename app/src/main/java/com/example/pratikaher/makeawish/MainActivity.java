package com.example.pratikaher.makeawish;

import android.support.v4.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.net.MalformedURLException;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager = getSupportFragmentManager();

//    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    DoctorFragment fragment = new DoctorFragment();
    DoctorHistory doctorHistory=new DoctorHistory();
    DoctorProfile doctorProfile=new DoctorProfile();

    public MainActivity() throws MalformedURLException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        manager.beginTransaction().replace(R.id.home_fragment,fragment).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.doctor_home:
                                manager.beginTransaction().replace(R.id.home_fragment,fragment).commit();
                                break;

                            case R.id.doctor_history:
                                manager.beginTransaction().replace(R.id.home_fragment,doctorHistory).commit();
                                break;

                            case R.id.doctor_profile:
                                manager.beginTransaction().replace(R.id.home_fragment,doctorProfile).commit();
                                break;
                        }
                    return true;
                    }
                });
    }
}
