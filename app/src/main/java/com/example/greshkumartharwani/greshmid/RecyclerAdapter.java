package com.example.greshkumartharwani.greshmid;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Gresh Kumar Tharwani on 10/21/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context mcontext;
    ArrayList<recyclermodel> recylist;

    public RecyclerAdapter(Context mcontext, ArrayList<recyclermodel> recylist) {
        this.mcontext = mcontext;
        this.recylist = recylist;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  txt1,txt2,txt3,txt4,txt5,txt6;
        ImageView image1,image2,image3;

        public MyViewHolder(View view) {
            super(view);
            txt1 = (TextView) view.findViewById(R.id.txt1);
            txt2 = (TextView) view.findViewById(R.id.txt2);
            txt3 = (TextView) view.findViewById(R.id.txt3);
            txt4 = (TextView) view.findViewById(R.id.txt4);
            txt5 = (TextView) view.findViewById(R.id.txt5);
            txt6 = (TextView) view.findViewById(R.id.txt6);

            image1 = (ImageView) view.findViewById(R.id.image1);
            image2 = (ImageView) view.findViewById(R.id.image2);
            image3 = (ImageView) view.findViewById(R.id.image3);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rowrecycler, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        recyclermodel cycle = recylist.get(position);
        holder.txt1.setText(cycle.getTxt1());
        holder.txt2.setText(cycle.getTxt2());
        holder.txt3.setText(cycle.getTxt3());
        holder.txt4.setText(cycle.getTxt4());
        holder.txt5.setText(cycle.getTxt5());
        holder.txt6.setText(cycle.getTxt6());


        Picasso.with(mcontext)
                .load(cycle.getImageurl1())
                .into(holder.image1);
        Picasso.with(mcontext)
                .load(cycle.getImageurl2())
                .into(holder.image2);
        Picasso.with(mcontext)
                .load(cycle.getImageurl3())
                .into(holder.image3);

    }

    public int getItemCount() {
        return recylist.size();
    }
}
