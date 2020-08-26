package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestResult extends AppCompatActivity {

    TextView text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        text6 = (TextView)findViewById(R.id.textView6);

        Intent intent = getIntent();
        Data data = Data.getData();

        String data1 = data.getData(0);
        String data2 = intent.getStringExtra("data2");

    }
}