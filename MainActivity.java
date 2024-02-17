package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView helloWorld;
    Button btnPress, btnClear;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloWorld = findViewById(R.id.helloworldtxt);
        helloWorld.setText("wow");


        btnPress = findViewById(R.id.btnResult);
        btnClear = findViewById(R.id.btnClear);
        btnPress.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }


    public void onClick(View v){
        if (v.getId() == R.id.btnResult){
            helloWorld.setText("I pressed the button");
        }
        else if(v.getId() == R.id.btnClear){
            //code for clear button here
            helloWorld.setText("");
        }
    }
}