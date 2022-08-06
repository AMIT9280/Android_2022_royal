package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.hw_login_page.R;

public class SimpleGridViewActivity extends AppCompatActivity {
    GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_grid_view);

        gridview = findViewById(R.id.grid);

    }
}