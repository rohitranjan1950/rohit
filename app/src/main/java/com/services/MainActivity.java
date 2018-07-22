package com.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bt_start,bt_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_start=findViewById(R.id.btn_start);

        bt_stop=findViewById(R.id.btn_stop);

        bt_start.setOnClickListener(this);

        bt_stop.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){




            case R.id.btn_start:

                Intent start=new Intent(getApplicationContext(),Backgroundwork.class);

                startService(start);

                break;


            case R.id.btn_stop:

                Intent stop=new Intent(getApplicationContext(),Backgroundwork.class);

                stopService(stop);

                break;

        }



    }
}
