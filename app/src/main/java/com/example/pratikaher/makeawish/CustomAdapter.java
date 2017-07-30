package com.example.pratikaher.makeawish;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratikaher on 29/07/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    List<String> childlist;
    Boolean volunteer=false;
    Boolean donor=false;


    public CustomAdapter( List<String> childlist) {

        this.childlist=childlist;
    }
    public CustomAdapter(List<String> childlist,boolean bool){
        this.childlist=childlist;
        this.volunteer=bool;
    }
    public CustomAdapter(List<String> childlist,boolean bool,boolean bool1)
    {
        this.childlist=childlist;
        this.volunteer=bool;
        this.donor=bool1;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if(volunteer){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.volunteer_row,parent,false);
        }else if(donor){
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        }
        else
        {
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.donor_row,parent,false);
        }
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.childname.setText(childlist.get(position));

    }

    @Override
    public int getItemCount() {
        return childlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView childname;

        public ViewHolder(View itemView) {
            super(itemView);
            childname=(TextView)itemView.findViewById(R.id.childname);

        }

    }
}
