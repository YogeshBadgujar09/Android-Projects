package com.yogesh.date_practice;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.ZonedDateTime;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_layout);
    }


    public void btnDatePicker(View v)
    {
        TextView txtsetData = findViewById(R.id.txtSetDate);

      DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
          @Override
          public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
              txtsetData.setText("Date : " + dayOfMonth + "/" + month + "/" + year);
          }
      },1950,1,1);

        datePickerDialog.show();
    }
}
