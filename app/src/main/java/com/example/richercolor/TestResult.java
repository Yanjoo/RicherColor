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

        String data1 = intent.getStringExtra("data1");
        String data2 = intent.getStringExtra("data2");

        text6.setText("data1:"+data1+"\n");
        text6.append("data2:"+data2+"\n");
    }
}