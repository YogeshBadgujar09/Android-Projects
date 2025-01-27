package com.yogesh.bundleuse_email;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout);
    }

    public void sendEmail()
    {
        EditText to = findViewById(R.id.txtTo);
          EditText sub = findViewById(R.id.txtSubject);
          EditText message = findViewById(R.id.txtConsoleEmail);


        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{ to.getText().toString() });
        i.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,message.getText().toString());

        startActivity(Intent.createChooser(i,"choose"));
    }
}
