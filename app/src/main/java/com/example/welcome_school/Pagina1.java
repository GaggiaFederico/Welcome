package com.example.welcome_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Pagina1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);
        String Stringa=null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             Stringa = extras.getString("stringa");

        }

        Toast.makeText(getApplicationContext(),""+ Stringa, Toast.LENGTH_LONG).show();
    }
}