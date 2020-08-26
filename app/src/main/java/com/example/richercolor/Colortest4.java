package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colortest4 extends AppCompatActivity {

    private Button btn_next4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest4);

        btn_next4 = findViewById(R.id.next4);
        btn_next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Colortest4.this, Colortest5.class);
                startActivity(intent);
            }
        });
    }
}