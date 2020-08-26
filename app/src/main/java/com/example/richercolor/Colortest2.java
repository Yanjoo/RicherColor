package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colortest2 extends AppCompatActivity {

    private Button btn_next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest2);
        btn_next2=findViewById(R.id.next2);
        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Colortest2.this,Colortest3.class);
                startActivity(intent);
            }
        });
    }
}