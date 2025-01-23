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
        //i.setData(Uri.parse("mailto"));
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{to.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,message.getText().toString());

        startActivity(Intent.createChooser(i,"choose a client"));


    }
}
