package com.example.androidfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Netflix_login extends AppCompatActivity {

    EditText edtemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix_login);

        edtemail = findViewById(R.id.edt_email);


      /*  String strEmail = edtemail.getText().toString();

        Intent i = new Intent(Netflix_login.this,HomeActivity.class);
        i.putExtra("KEY_EMAIL",strEmail);
        startActivity(i);*/
    }
}