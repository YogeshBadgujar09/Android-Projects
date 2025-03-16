package com.yogesh.practical5_scrollview;

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

    public void verticalScrollView(View v){
        Intent i = new Intent(MainActivity.this,VeriticalScrlView.class);
        startActivity(i);
    }

    public void horizontalScrollView(View v)
    {
        Intent i = new Intent(MainActivity.this,HorizontalScrlViewActivity.class);
        startActivity(i);
    }
}
