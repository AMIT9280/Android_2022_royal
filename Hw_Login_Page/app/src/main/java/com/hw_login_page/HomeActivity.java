package com.hw_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView  TvData,tvUsername,tvtime,tvdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //tvUsername = findViewById(R.id.Tv_UserName);
        //tvtime = findViewById(R.id.tv_time);
        //tvdate = findViewById(R.id.tv_date);

        TvData = findViewById(R.id.Tv_pData);



        Intent i = getIntent();
         String strdata = i.getStringExtra("KEY_DATA");
         TvData.setText("You have Selected "+strdata);
       // String strUsername = i.getStringExtra("KEY_USERNAME");
        //tvUsername.setText("WELCOME "+strUsername);

        //String strtime= i.getStringExtra("KEY_time");
        //tvtime.setText("Time "+strtime);

        //String strdate= i.getStringExtra("KEY_date");
        //tvdate.setText("Date "+strdate);
    }
}