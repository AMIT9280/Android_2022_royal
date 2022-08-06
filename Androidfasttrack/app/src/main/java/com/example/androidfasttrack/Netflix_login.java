package com.example.androidfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Netflix_login extends AppCompatActivity {
    EditText edt_email;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix_login);

        edt_email = findViewById(R.id.edt_email);
        btn_login = findViewById(R.id.btn_login);


        String tv_User = edt_email.toString();
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.putExtra("KEY_USER", tv_User);
            }
        });

    }
}