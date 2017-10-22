package com.example.greshkumartharwani.greshmid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;

import java.util.ArrayList;

/**
 * Created by Gresh Kumar Tharwani on 10/21/2017.
 */

public class pageractivity extends AppCompatActivity {

    ArrayList<modelpager> list;
    ViewPager vp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagerlayout);

        vp=(ViewPager) findViewById(R.id.vpager);
        list=new ArrayList<>();
        modelpager mp=new modelpager();
        mp.setTxt1("gresh");
        mp.setTxt2("is");
        mp.setTxt3("genious");
        mp.setImageurl("http://assets2.bigthink.com/system/video_backgrounds/62299/original/D_Bodan_Einstein_Genius_CMS.jpg?1485216473");
        list.add(mp);

        mp=new modelpager();
        mp.setTxt1("fareed");
        mp.setTxt2("is");
        mp.setTxt3("chapuu");
        mp.setImageurl("http://improvandy.com/wp-content/uploads/2014/10/genius.jpg");
        list.add(mp);

        pageradapter pa=new pageradapter(this,list);
        vp.setAdapter(pa);
    }
}
