package com.yogesh.practical3_registrationpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calc_Activity extends AppCompatActivity {

    EditText txtNo;
    TextView txtTotal ;
    String operator = "";
    double firstValue = 0;

    boolean isNewOperation = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        txtNo = findViewById(R.id.txtNo);

    }

    public void typenumber(View v) {
        Button b = (Button) v;
        txtNo.setText(txtNo.getText().toString() + b.getText().toString());
        txtTotal =
    }

    public void calculate(View v) {
        double secondValue = Double.parseDouble(txtNo.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                } else {
                    txtNo.setText("Error"); // Handle division by zero
                    return;
                }
                break;
            case "%":
                result = firstValue % secondValue;
                break;
        }

        txtNo.setText(String.valueOf(result));
        operator = ""; // Reset operator after calculation
        isNewOperation = true; // Allow new operation

    }

    public void clear(View v) {
        txtNo.setText("");
        operator = "";
        firstValue = 0;
        isNewOperation = true;
    }
}