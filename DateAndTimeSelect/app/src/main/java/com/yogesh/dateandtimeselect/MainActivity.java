package com.yogesh.dateandtimeselect;

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

    public void dateLayout(View v) {
        startActivity(new Intent(MainActivity.this,DateActivity.class));
    }

    public void timeLayout(View v) {
        startActivity(new Intent(MainActivity.this,TimeActivity.class));
    }
}
