package com.example.parcialappsmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    EditText editText;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.parcialSpinner);
        editText = findViewById(R.id.parcialEditText);

        btn1 = findViewById(R.id.btn1);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
    }

}