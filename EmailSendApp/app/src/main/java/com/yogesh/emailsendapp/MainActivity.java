package com.yogesh.emailsendapp;

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

    public void sendEmail(View v)
    {
        EditText to = findViewById(R.id.txtTo);
        EditText subject = findViewById(R.id.txtSubject);
        EditText message = findViewById(R.id.txtComposeMail);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailto"));

        i.putExtra(Intent.EXTRA_EMAIL, new String[]{to.toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,subject.toString());
        i.putExtra(Intent.EXTRA_TEXT,message.toString());

        startActivity(i);


    }
}
