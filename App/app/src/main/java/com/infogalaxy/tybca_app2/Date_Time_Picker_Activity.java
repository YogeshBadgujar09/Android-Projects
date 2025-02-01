package com.infogalaxy.tybca_app2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Date_Time_Picker_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_picker_layout);
    }

    public void openDPicker(View v)
    {
        TextView txtDate = findViewById(R.id.txtDate);
        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                txtDate.setText("Date : "+i2+"/"+(i1+1)+"/"+i);
            }
        },2000,1,1);
        dpd.show();
    }


    public void openTPicker(View v)
    {
        TextView txtTime = findViewById(R.id.txtTime);
        TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                txtTime.setText("Time : "+i+":"+i1);
            }
        },12,0,true);
        tpd.show();
    }
}
