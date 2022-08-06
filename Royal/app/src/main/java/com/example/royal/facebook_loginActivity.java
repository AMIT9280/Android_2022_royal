package com.example.royal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class facebook_loginActivity extends AppCompatActivity {

    EditText edt_user;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        edt_user = findViewById(R.id.edt_user);
        btn_login = findViewById(R.id.btn_login);

       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String edtdata = edt_user.getText().toString();

               Intent i = new Intent(facebook_loginActivity.this,Home_fbActivity.class);
               i.putExtra("KEY_USER",edtdata);
               startActivity(i);
           }
       });
    }
}