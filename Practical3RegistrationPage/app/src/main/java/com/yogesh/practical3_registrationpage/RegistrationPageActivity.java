package com.yogesh.practical3_registrationpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page_layout);

        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtName = findViewById(R.id.txtName);
                EditText txtMobileNo  = findViewById(R.id.txtMobileNo);
                EditText txtEmail = findViewById(R.id.txtEmail);
                EditText txtAddress = findViewById(R.id.txtAddress);

                TextView lblName = findViewById(R.id.lblName);
                TextView lblMobileNo = findViewById(R.id.lblMobileNo);
                TextView lblEmail = findViewById(R.id.lblEmail);
                TextView lblAddress = findViewById(R.id.lblAddress);

                lblName.setText(lblName.getText().toString() + txtName.getText().toString());
                lblMobileNo.setText(lblMobileNo.getText().toString() + txtMobileNo.getText().toString());
                lblEmail.setText(lblEmail.getText().toString() + txtEmail.getText().toString());
                lblAddress.setText(lblAddress.getText().toString() + txtAddress.getText().toString());

            }
        });
    }
}
