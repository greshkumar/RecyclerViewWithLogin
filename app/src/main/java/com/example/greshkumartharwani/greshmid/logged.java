package com.example.greshkumartharwani.greshmid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Gresh Kumar Tharwani on 10/21/2017.
 */

public class logged extends AppCompatActivity {

    Button pager;
    Button recycle;

    TextView detail;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loggedin);

        detail=(TextView) findViewById(R.id.detail);
        Bundle b= getIntent().getExtras();
        detail.setText("USER NAME : "+b.getString("user")+"\n PASSWORD : "+b.getString("pass"));

        pager= (Button) findViewById(R.id.pager);
        recycle=(Button) findViewById(R.id.recycler);

        pager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(logged.this,pageractivity.class);
                startActivity(i);
                finish();
            }
        });
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(logged.this,RecycleActivity.class);
                startActivity(i);
                finish();
            }
        });
    }


}
