package com.example.pratikaher.makeawish;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

import static android.R.attr.data;
import static android.R.id.content;

/**
 * Created by pratikaher on 29/07/17.
 */

public class DoctorFragment extends Fragment implements View.OnClickListener {
    View layoutinflater;
    Button button;
    EditText Name;
    EditText dob;
    EditText ill;
    EditText docname;
    EditText pname;
    EditText pid;
    EditText doc_id;



    public DoctorFragment() throws MalformedURLException {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        layoutinflater = inflater.inflate(R.layout.doctor_home, container, false);
        button=(Button)layoutinflater.findViewById(R.id.button);
        Name=(EditText)layoutinflater.findViewById(R.id.name);

        dob=(EditText)layoutinflater.findViewById(R.id.dob);

        ill=(EditText)layoutinflater.findViewById(R.id.ill);

        docname=(EditText)layoutinflater.findViewById(R.id.docname);

        pname=(EditText)layoutinflater.findViewById(R.id.pname);

        pid=(EditText)layoutinflater.findViewById(R.id.pid);

        doc_id=(EditText)layoutinflater.findViewById(R.id.doc_id);

        button=(Button)layoutinflater.findViewById(R.id.submit_btn);


        button.setOnClickListener(this);
        return layoutinflater;
    }


    @Override
    public void onClick(View v) {
        Name.setText("");
        dob.setText("");
        ill.setText("");
        docname.setText("");
        pname.setText("");
        pid.setText("");
        doc_id.setText("");

    }
}