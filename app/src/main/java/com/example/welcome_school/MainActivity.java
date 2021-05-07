package com.example.welcome_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.TextSend);
        reset=findViewById(R.id.reset);
    }

    public void toast(View view){
        Toast.makeText(getApplicationContext(),""+editText.getText(), Toast.LENGTH_SHORT).show();
    }
    public void reset(View view){
        editText.setText("");
    }

    public void play(View view){
        Intent intent = new Intent(MainActivity.this, Pagina1.class);
        intent.putExtra("stringa", editText.getText());
        startActivity(intent);
    }
}