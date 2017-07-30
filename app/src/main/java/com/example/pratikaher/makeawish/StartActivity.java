package com.example.pratikaher.makeawish;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by pratikaher on 30/07/17.
 */


public class StartActivity extends AppCompatActivity {
    Button doctor;
    Button volunteer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactvity);

        doctor=(Button)findViewById(R.id.button2);
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        volunteer=(Button)findViewById(R.id.button3);
        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartActivity.this,VolunteerSide.class);
                startActivity(intent);

            }
        });

    }
}
