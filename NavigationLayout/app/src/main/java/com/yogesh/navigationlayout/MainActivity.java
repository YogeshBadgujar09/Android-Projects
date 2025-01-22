package com.yogesh.navigationlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);


    }

    public void btnNavigate1(View v){

      Intent i = new Intent(MainActivity.this,Navigate1.class);
        startActivity(i);
    }

    public void btnNavigate2(View v){
       Intent i = new Intent(MainActivity.this,Navigate2.class);
       startActivity(i);

    }

    public void btnNavigate3(View v)
    {
        Intent i = new Intent(MainActivity.this,Navigate3.class);
        startActivity(i);
    }
}
