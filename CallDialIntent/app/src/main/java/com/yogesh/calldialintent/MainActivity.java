package com.yogesh.calldialintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
    
    public void call(View v){

        EditText txtMobileNo = findViewById(R.id.txtPhoneNumber);

        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+txtMobileNo.getText().toString()));
        startActivity(i);

    }
}
