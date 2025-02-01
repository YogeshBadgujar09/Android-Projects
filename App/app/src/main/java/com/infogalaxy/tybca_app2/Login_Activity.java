package com.infogalaxy.tybca_app2;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        txtUsername.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(txtUsername.getText().toString().equalsIgnoreCase("Admin")
                        && txtPassword.getText().toString().equalsIgnoreCase("12345"))
                {
                    Toast.makeText(Login_Activity.this, "Username and Password Match!!!", Toast.LENGTH_SHORT).show();
                    btnLogin.setEnabled(true);
                }

                return false;
            }
        });

        txtPassword.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(txtUsername.getText().toString().equalsIgnoreCase("Admin")
                        && txtPassword.getText().toString().equalsIgnoreCase("12345"))
                {
                    Toast.makeText(Login_Activity.this, "Username and Password Match!!!", Toast.LENGTH_SHORT).show();
                    btnLogin.setEnabled(true);
                }
                return false;
            }
        });

    }
}
