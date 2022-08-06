package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.hw_login_page.R;

public class SeekActivity extends AppCompatActivity {

        private SeekBar seekbar;
        private TextView tvseekbnar;
        private Button btnprint;
        private RatingBar ratingbar;
        private TextView tvratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);
        seekbar = (SeekBar)findViewById(R.id.seekbar);
        tvseekbnar = (TextView) findViewById(R.id.tv_seekbar);
        btnprint = (Button)findViewById(R.id.btn_print);
        ratingbar = (RatingBar)findViewById(R.id.ratingbar);
        tvratingbar =(TextView)findViewById(R.id.tv_ratingbar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    tvseekbnar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}