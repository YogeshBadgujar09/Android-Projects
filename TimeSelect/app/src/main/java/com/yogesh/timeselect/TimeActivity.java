package com.yogesh.timeselect;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.format.DateTimeFormatter;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.time_demo_layout);
    }

    public void btnTime(View v)
    {
        TextView txtView = findViewById(R.id.txtSetTime);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                txtView.setText( hourOfDay + ":" + minute);
            }
        },12,0,false);
        timePickerDialog.show();
    }
}
