package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Colortest1 extends AppCompatActivity {

    private Button btn_next1;
    RadioGroup group1, group2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest1);

        btn_next1 = findViewById(R.id.next1);
        group1 = (RadioGroup)findViewById(R.id.test1);
        group2 = (RadioGroup)findViewById(R.id.test2);

        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datasend();
                Intent intent = new Intent(Colortest1.this,Colortest2.class);
                startActivity(intent);
            }
        });
    }

    public void datasend(){
        int id1 = group1.getCheckedRadioButtonId();
        int id2 = group2.getCheckedRadioButtonId();
        Intent intent1 = new Intent(this,TestResult.class);

        switch (id1){
            case R.id.radio1:
                intent1.putExtra("data1","nomal");
                break;
            case R.id.radio2:
                intent1.putExtra("data1","wrong");
                break;
            case R.id.radio3:
                intent1.putExtra("data1","wrong");
                break;
        }

        switch (id2){
            case R.id.radio4:
                intent1.putExtra("data2","green");
                break;
            case R.id.radio5:
                intent1.putExtra("data2","nomal");
                break;
            case R.id.radio6:
                intent1.putExtra("data2","wrong");
                break;
        }
        startActivity(intent1);
    }
}