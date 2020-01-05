package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertFunc(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        double d = Double.parseDouble(editText.getText().toString());
        double inRupees= (71.37) * d;
        String s=String.valueOf(inRupees);
        Toast.makeText(this, "Amount in INR : " + s, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
