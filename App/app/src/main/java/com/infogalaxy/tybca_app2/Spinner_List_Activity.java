package com.infogalaxy.tybca_app2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Spinner_List_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_list_layout);

        Toast.makeText(this, "Welcome User!!!", Toast.LENGTH_SHORT).show();

        //String[] names = {"Nayan","Gagan","Raman"};
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Nayan");
        namesList.add("Gagan");
        namesList.add("Raman");

        Spinner spnContacts = findViewById(R.id.spnContacts);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Spinner_List_Activity.this,
                android.R.layout.simple_list_item_1,
                namesList);
        spnContacts.setAdapter(adapter);

        ListView lstContacts = findViewById(R.id.lstContacts);

        lstContacts.setAdapter(adapter);

        lstContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Spinner_List_Activity.this, "Item Clicked = "+namesList.get(i), Toast.LENGTH_LONG).show();
            }
        });

        spnContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Spinner_List_Activity.this, "Item Clicked = "+namesList.get(i), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
