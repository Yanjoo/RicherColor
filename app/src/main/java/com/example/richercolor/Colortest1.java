package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colortest1 extends AppCompatActivity {

    private Button btn_next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest1);

        btn_next1 = findViewById(R.id.next1);
        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Colortest1.this,Colortest2.class);
                startActivity(intent);
            }
        });
    }
}