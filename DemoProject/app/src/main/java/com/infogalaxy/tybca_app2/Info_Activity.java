package com.infogalaxy.tybca_app2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Info_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        TextView txtUsername = findViewById(R.id.txtUsername);
        TextView txtPassword = findViewById(R.id.txtPassword);

        Bundle B = getIntent().getExtras();
        txtUsername.setText(B.get("USERNAME").toString());
        txtPassword.setText(B.get("PASSWORD").toString());
    }
}
