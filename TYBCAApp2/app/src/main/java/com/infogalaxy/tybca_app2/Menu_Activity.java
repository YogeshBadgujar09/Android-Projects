package com.infogalaxy.tybca_app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_Activity.this,Addition_Activity.class);
                startActivity(i);
            }
        });
    }
    public void openSub(View v) {
        Intent i = new Intent(Menu_Activity.this,Substraction_Activity.class);
        startActivity(i);
    }

    public void submit(View v)
    {
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);

        Intent i = new Intent(Menu_Activity.this,Info_Activity.class);

        i.putExtra("USERNAME",txtUsername.getText().toString());
        i.putExtra("PASSWORD",txtPassword.getText().toString());

        startActivity(i);
    }

    public void openCall(View v) {
        Intent i = new Intent(Menu_Activity.this,Call_Activity.class);
        startActivity(i);
    }

    public void openEMail(View v) {
        startActivity(new Intent(Menu_Activity.this,EMail_Activity.class));
    }
}
