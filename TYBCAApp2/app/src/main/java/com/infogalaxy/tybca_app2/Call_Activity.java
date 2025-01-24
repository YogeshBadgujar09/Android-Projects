package com.infogalaxy.tybca_app2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Call_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_layout);
    }
    public void makecall(View v) {
        EditText txtMobileNo = findViewById(R.id.txtMobileNo);

        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+txtMobileNo.getText().toString()));
        startActivity(i);
    }
}
