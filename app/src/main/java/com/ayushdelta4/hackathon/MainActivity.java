package com.ayushdelta4.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(v -> setLoginbtn());
    }
    //admin and admin
    public void setLoginbtn (){
        EditText username = findViewById(R.id.useranme);
        EditText password = findViewById(R.id.password);
        if (username.getText().toString().equals("aditya") && password.getText().toString().equals("aadi123")) {
            //correct
            Intent intent = new Intent(this, first.class);
            startActivity(intent);
        } else {
            //incorrect
            Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
        }
    }


}