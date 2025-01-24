package com.infogalaxy.tybca_app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EMail_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_layout);
    }

    public void sendMail(View v) {
        EditText txtTo = findViewById(R.id.txtTo);
        EditText txtSubject = findViewById(R.id.txtSubject);
        EditText txtMessage = findViewById(R.id.txtMessage);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{txtTo.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,txtSubject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,txtMessage.getText().toString());

        startActivity(Intent.createChooser(i,"Send My Mail using:"));
    }
}
