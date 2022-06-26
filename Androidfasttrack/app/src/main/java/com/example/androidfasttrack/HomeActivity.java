package com.example.androidfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tv_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv_Email = findViewById(R.id.Tv_Email);

        Intent i = getIntent();
        String strEmail = i.getStringExtra("KEY_EMAIL");
        tv_Email.setText(strEmail);
    }
}