package com.example.encryptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class encrypt_scene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt_scene);
    }
    public void onBackBtnPressed(View view){
        finish();
    }
    public void onSelectFilePressed(View view){
        Toast.makeText(this, "Feature coming soon..", Toast.LENGTH_SHORT).show();
    }
    public void onEncryptButtonPressed(View view){
        Toast.makeText(this, "No file selected to encrypt", Toast.LENGTH_SHORT).show();
    }
}