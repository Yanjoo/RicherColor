package com.example.richercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String[] permission_list = {
            Manifest.permission.READ_EXTERNAL_STORAGE
    };

    Button takePhotoBtn;
    Button getPhotoBtn;
    Button viewArtBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permission_list, 0);
        }

        takePhotoBtn = findViewById(R.id.take_photo_btn);
        getPhotoBtn = findViewById(R.id.get_photo_btn);
        viewArtBtn = findViewById(R.id.view_art);


        getPhotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhoto();
            }
        });
    }

    private void takePhoto() {
        Intent intent = new Intent(this, Album.class);
        startActivity(intent);
    }
}