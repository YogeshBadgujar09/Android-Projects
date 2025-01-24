package com.infogalaxy.tybca_app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Addition_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition_layout);

        EditText txtNo1 = findViewById(R.id.txtNo1);
        EditText txtNo2 = findViewById(R.id.txtNo2);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView txtAdd = findViewById(R.id.txtAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtNo1.getText().toString());
                int b = Integer.parseInt(txtNo2.getText().toString());
                int c = a + b;
                txtAdd.setText(String.valueOf(c));
            }
        });

    }
}
