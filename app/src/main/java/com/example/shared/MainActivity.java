package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Name;
    private EditText Password; private int login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainn);

        Name = findViewById(R.id.editText4);
        Password = findViewById(R.id.editText7);
        Submit = findViewById(R.id.button2);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitbtn(Name.getText().toString(), Password.getText().toString());

            }

        });

    }



    public void submitbtn (String userName, String userPassword) {
        if ((userName.equals("Admin") && userPassword.equals("12345"))) {
            Intent i = new Intent(MainActivity.this, display.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
    }
        private void setvalue() {

            SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
            SharedPreferences.Editor editor1 = settings1.edit();
            editor1.putInt("Snow_density", 1);
            editor1.commit();
        }

        private void checkvalue() {
            SharedPreferences settings1 = getSharedPreferences("Beginning", 0);
            login = settings1.getInt("Snow_density", 0);
        }
    }

