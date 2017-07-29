package com.example.niyati.childform;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.niyati.childform.R;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText NameTXT, DobTXT, IllTXT, DNameTXT, PNameTXT,PidTXT;
    Button but;
    String name, dob,ill, docname,pname,pid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        NameTXT = (EditText) findViewById(R.id.name);
        DobTXT = (EditText) findViewById(R.id.dob);
        IllTXT = (EditText) findViewById(R.id.ill);
        DNameTXT = (EditText) findViewById(R.id.docname);
        PNameTXT = (EditText) findViewById(R.id.pname);
        PidTXT = (EditText) findViewById(R.id.pid);
        but = (Button) findViewById(R.id.button);
        but.setOnClickListener(this);
        Toast.makeText(this, "NameTXT", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {}
    
}