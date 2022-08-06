package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hw_login_page.R;

public class SeekprintActivity extends AppCompatActivity {

    private TextView tvprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekprint);
        tvprint = findViewById(R.id.tvPrint);

        Intent i = new Intent();
        String Print =i.getStringExtra("Print");
        tvprint.setText("Value Is :-"+Print);
    }
}