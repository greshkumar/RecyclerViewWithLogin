package com.example.greshkumartharwani.greshmid;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
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

public class pageradapter extends PagerAdapter {


    Context con;
    LayoutInflater inf;
    ArrayList <modelpager> list;


    public pageradapter(Context con, ArrayList<modelpager> list) {
        this.con = con;
        this.list = list;
        inf=LayoutInflater.from(con);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ViewGroup layout = (ViewGroup) inf.inflate(R.layout.pageritem, container, false);

        TextView txt1=(TextView) layout.findViewById(R.id.txt1);
        TextView txt2=(TextView) layout.findViewById(R.id.txt2);
        TextView txt3=(TextView) layout.findViewById(R.id.txt3);
        ImageView img1= (ImageView) layout.findViewById(R.id.img);

        txt1.setText(list.get(position).getTxt1());
        txt2.setText(list.get(position).getTxt2());
        txt3.setText(list.get(position).getTxt3());

        Picasso.with(con)
                .load(list.get(position).getImageurl())
                .into(img1);

        container.addView(layout);
        return layout;


    }
}
