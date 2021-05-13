package com.example.welcome_school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Pagina1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pagina1);
        Bundle datiPassati= getIntent().getExtras();
        String Dato = datiPassati.getString("stringa");
        TextView titolo = (TextView) findViewById(R.id.Visual);
        if(Dato != null){
            titolo.setText(Dato);
        } else{
            titolo.setText("Errore nel passaggio");
        }

    }
}