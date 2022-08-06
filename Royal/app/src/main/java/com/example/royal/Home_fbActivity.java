package com.example.royal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home_fbActivity extends AppCompatActivity {

    TextView tv_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fb);

        tv_user = findViewById(R.id.tv_user);

        Intent i = getIntent();
        String tv_data = i.getStringExtra("KEY_USER");
        tv_user.setText("Welcome "+tv_data);
    }
}