package com.example.pratikaher.makeawish;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by pratikaher on 30/07/17.
 */

public class DonorSide extends AppCompatActivity {
    FragmentManager manager = getSupportFragmentManager();
//    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    DonorFeed donorFeed = new DonorFeed();
//    DonorProfile donorProfile=new DonorProfile();
//    DonorCart donorCart=new DonorCart();
    DonorSuccess donorSuccess=new DonorSuccess();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donormain);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        manager.beginTransaction().replace(R.id.home_fragment,donorFeed).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.donorfeed:
                                manager.beginTransaction().replace(R.id.home_fragment,donorFeed).commit();
                                break;

                            case R.id.donorcart:
//                                manager.beginTransaction().replace(R.id.home_fragment,doctorHistory).commit();
                                break;

                            case R.id.donordetails:
//                                manager.beginTransaction().replace(R.id.home_fragment,doctorProfile).commit();
                                break;
                            case R.id.donorsuccess:
//                                manager.beginTransaction().replace(R.id.home_fragment,doctorProfile).commit();
                                break;
                        }
                        return true;
                    }
                });
    }
}
