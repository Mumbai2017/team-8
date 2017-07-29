package com.example.pratikaher.makeawish;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import static android.R.attr.data;
import static android.R.id.content;

/**
 * Created by pratikaher on 29/07/17.
 */

public class DoctorFragment extends Fragment {
    View layoutinflater;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        layoutinflater = inflater.inflate(R.layout.doctor_home, container, false);

        Button saveme=(Button) layoutinflater.findViewById(R.id.submit_btn);

        saveme.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v)
            {
                try{

                    // CALL GetText method to make post method call
                    GetText();
                }
                catch (Exception e) {
                }
            }
        });
        return layoutinflater;
    }

    // Create GetText Metod
    public  void  GetText()  throws UnsupportedEncodingException {
        // Get user defined values
        final EditText name = (EditText)layoutinflater.findViewById(R.id.name);
        final EditText pid = (EditText)layoutinflater.findViewById(R.id.pid);
        final EditText pname = (EditText)layoutinflater.findViewById(R.id.pname);
        final EditText docname = (EditText)layoutinflater.findViewById(R.id.docname);
        final EditText ill = (EditText)layoutinflater.findViewById(R.id.ill);
        final EditText dob = (EditText)layoutinflater.findViewById(R.id.dob);
        final EditText doc_id = (EditText)layoutinflater.findViewById(R.id.doc_id);
        final String childname=name.getText().toString();
        final String parentid=pid.getText().toString();
        final String parentname=pname.getText().toString();
        final String doctorname=docname.getText().toString();
        final String illness=ill.getText().toString();
        final String dateofbirth=dob.getText().toString();
        final String doctorid=doc_id.getText().toString();



        // Create data variable for sent values to server
        class DownloadFilesTask extends AsyncTask<URL, Integer, Long> {



            @Override
            protected Long doInBackground(URL... params) {
                String data="";
                try {
                    data = URLEncoder.encode("parent_id", "UTF-8")
                            + "=" + URLEncoder.encode(parentid, "UTF-8");

                    data += "&" + URLEncoder.encode("child_name", "UTF-8") + "="
                            + URLEncoder.encode(childname, "UTF-8");

                    data += "&" + URLEncoder.encode("parent_name", "UTF-8")
                            + "=" + URLEncoder.encode(parentname, "UTF-8");

                    data += "&" + URLEncoder.encode("doctor_name", "UTF-8")
                            + "=" + URLEncoder.encode(doctorname, "UTF-8");

                    data += "&" + URLEncoder.encode("doctor_id", "UTF-8")
                            + "=" + URLEncoder.encode(doctorid, "UTF-8");

                    data += "&" + URLEncoder.encode("dob", "UTF-8")
                            + "=" + URLEncoder.encode(dateofbirth, "UTF-8");

                    data += "&" + URLEncoder.encode("ill", "UTF-8")
                            + "=" + URLEncoder.encode(illness, "UTF-8");
                }
                catch(Exception e){}

                String text = "";
                BufferedReader reader = null;

                // Send data
                try {

                    // Defined URL  where to send data
                    URL url = new URL("13.126.178.24/cfg/add_child.php");

                    // Send POST data request

                    URLConnection conn = url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                    wr.write(data);
                    wr.flush();

                    // Get the server response

                    reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line = null;

                    // Read Server Response
                    while ((line = reader.readLine()) != null) {
                        // Append server response in string
                        sb.append(line + "\n");
                    }


                    text = sb.toString();
                    Log.d("text",text);
                } catch (Exception ex) {

                } finally {
                    try {

                        reader.close();
                    } catch (Exception ex) {
                    }
                }
                return null;
            }
        }
        // Show response on activity

    }
}

