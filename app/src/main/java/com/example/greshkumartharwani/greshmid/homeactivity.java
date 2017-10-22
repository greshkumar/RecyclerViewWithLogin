package com.example.greshkumartharwani.greshmid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Gresh Kumar Tharwani on 10/21/2017.
 */

public class homeactivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btn1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1= (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!empty()){
                    if(et1.getText().toString().equals("gresh")&&et2.getText().toString().equals("pari")){
                        Intent i = new Intent(homeactivity.this,logged.class);
                        Bundle b = new Bundle();
                        b.putString("user",et1.getText().toString());
                        b.putString("pass",et2.getText().toString());
                        i.putExtras(b);
                        startActivity(i);
                        finish();
                    }else{
                        Toast.makeText(homeactivity.this,"invalid username/password",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    boolean empty(){
        boolean isempty=false;
        if(et1.getText().toString().equals("")){
            isempty=true;
            et1.setError("enter username");
        }
        if(et2.getText().toString().equals("")){
            isempty=true;
            et2.setError("enter password");
        }

        return isempty;
    }
}
