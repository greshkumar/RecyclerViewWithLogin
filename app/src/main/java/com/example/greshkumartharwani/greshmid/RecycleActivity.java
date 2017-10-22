package com.example.greshkumartharwani.greshmid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
/**
 * Created by Gresh Kumar Tharwani on 10/21/2017.
 */

public class RecycleActivity extends AppCompatActivity {

    ArrayList<recyclermodel> recyclelist;
    RecyclerView rcview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerlayout);


        recyclelist = new ArrayList<>();
        getitems();
        rcview = (RecyclerView) findViewById(R.id.vi_rec);

        LinearLayoutManager mManager = new LinearLayoutManager(getApplicationContext());
        rcview.setLayoutManager(mManager);

        RecyclerAdapter readpt = new RecyclerAdapter(this,recyclelist);
        rcview.setAdapter(readpt);

    }

    private void getitems(){

        recyclermodel mrecy = new recyclermodel();
        mrecy.setTxt1("Title 1");
        mrecy.setTxt2("Title 2");
        mrecy.setImageurl1("https://lumiere-a.akamaihd.net/v1/images/vt_cars3_nextgenerationextendedlook_900f0dd1.jpeg");

        recyclelist.add(mrecy);

        mrecy = new recyclermodel();
        mrecy.setTxt3("Title 3");
        mrecy.setTxt4("Desc 4");
        mrecy.setImageurl2("https://lumiere-a.akamaihd.net/v1/images/vt_cars3_nextgenerationextendedlook_900f0dd1.jpeg");

        recyclelist.add(mrecy);
        mrecy = new recyclermodel();
        mrecy.setTxt5("Title 3");
        mrecy.setTxt6("Desc 3");
        mrecy.setImageurl3("https://lumiere-a.akamaihd.net/v1/images/vt_cars3_nextgenerationextendedlook_900f0dd1.jpeg");



        recyclelist.add(mrecy);
    }
}
