package com.example.encryptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    // these function will run when Encrypt button is pressed on home screen
    public void onEncryptButtonPressed(View view){
        //do something
        Intent intent = new Intent(this, encrypt_scene.class);
        startActivity(intent);
    }
    public void onDecryptButtonPressed(View view){
        //do something
    }
    public void onGeneratePasswordButtonPressed(View view){
        //do something
    }
    public void onShowPasswordButtonPressed(View view){
        //do something
    }
    public void onAboutUsButtonPressed(View view){
        //do something
    }
    public void onSettingsButtonPressed(View view){
        //do something
    }
}