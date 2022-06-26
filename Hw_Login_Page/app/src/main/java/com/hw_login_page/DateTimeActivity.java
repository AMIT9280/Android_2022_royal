package com.hw_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {


    TextView tvdate,tvtime;
    Button btndate,btntime,btnsubmit;
    private int day,month,year;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        tvdate = findViewById(R.id.tv_date);
        btndate = findViewById(R.id.btn_date);

        tvtime = findViewById(R.id.tv_time);
        btntime = findViewById(R.id.btn_time);

        btnsubmit = findViewById(R.id.btn_submit);

        Calendar calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);

        hour = calendar.get(Calendar.HOUR);
        minute =  calendar.get(Calendar.MINUTE);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strdate = tvdate.getText().toString();
                String strtime = tvtime.getText().toString();

                Intent i = new Intent(DateTimeActivity.this,HomeActivity.class);
                i.putExtra("KEY_time",strtime);
                i.putExtra("KEY_date",strdate);
                startActivity(i);

            }
        });
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                            tvtime.setText(hour+":"+minute);
                    }
                },hour,minute,false);
                timePickerDialog.show();
            }
        });

        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimeActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayofmonth) {
                        tvdate.setText(dayofmonth+"/"+(month+1)+ "/" +year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
    }
}