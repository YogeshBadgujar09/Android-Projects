package com.yogesh.implicitintend_callexample;

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

    public void call(View v)
    {
//
//       EditText mob = findViewById(R.id.txtMobile);
//        Intent i = new Intent(Intent.ACTION_CALL);
//        i.setData(Uri.parse("tel:" + mob.getText().toString() ));
//        startActivity(i);

        EditText txtMobileNo = findViewById(R.id.txtMobile);
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+txtMobileNo.getText().toString()));
        startActivity(i);

    }
}
