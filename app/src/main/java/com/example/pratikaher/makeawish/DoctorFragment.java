package com.example.pratikaher.makeawish;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

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
    public  void  GetText()  throws UnsupportedEncodingException
    {
        // Get user defined values
        String name = layoutinflater.findViewById(R.id.name).toString();
        String pid = layoutinflater.findViewById(R.id.pid).toString();
        String pname = layoutinflater.findViewById(R.id.pname).toString();
        String docname = layoutinflater.findViewById(R.id.docname).toString();
        String ill = layoutinflater.findViewById(R.id.ill).toString();
        String dob = layoutinflater.findViewById(R.id.dob).toString();
        String doc_id = layoutinflater.findViewById(R.id.doc_id)


        // Create data variable for sent values to server

        String data = URLEncoder.encode("parent_id", "UTF-8")
                + "=" + URLEncoder.encode(pid, "UTF-8");

        data += "&" + URLEncoder.encode("child_name", "UTF-8") + "="
                + URLEncoder.encode(name, "UTF-8");

        data += "&" + URLEncoder.encode("parent_name", "UTF-8")
                + "=" + URLEncoder.encode(pname, "UTF-8");

        data += "&" + URLEncoder.encode("doctor_name", "UTF-8")
                + "=" + URLEncoder.encode(docname, "UTF-8");

        data += "&" + URLEncoder.encode("doctor_id", "UTF-8")
                + "=" + URLEncoder.encode(doc_id, "UTF-8");

        data += "&" + URLEncoder.encode("dob", "UTF-8")
                + "=" + URLEncoder.encode(dob, "UTF-8");

        data += "&" + URLEncoder.encode("ill", "UTF-8")
                + "=" + URLEncoder.encode(ill, "UTF-8");

        String text = "";
        BufferedReader reader=null;

        // Send data
        try
        {

            // Defined URL  where to send data
            URL url = new URL("13.126.178.24/cfg/add_child");

            // Send POST data request

            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write( data );
            wr.flush();

            // Get the server response

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            while((line = reader.readLine()) != null)
            {
                // Append server response in string
                sb.append(line + "\n");
            }


            text = sb.toString();
        }
        catch(Exception ex)
        {

        }
        finally
        {
            try
            {

                reader.close();
            }

            catch(Exception ex) {}
        }

        // Show response on activity


    }




    }
}
