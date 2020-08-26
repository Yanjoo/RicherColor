package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colortest3 extends AppCompatActivity {

    private Button btn_next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest3);

        btn_next3 = findViewById(R.id.next3);
        btn_next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Colortest3.this,Colortest4.class);
                startActivity(intent);
            }
        });
    }
}