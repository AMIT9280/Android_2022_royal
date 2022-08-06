package com.hw_login_page.Activitys;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.hw_login_page.R;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tvSpinner;
    String strLang[] ={"Select Any One","Android","java","Python","C",".net","Mean","Kotlin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinner);
        tvSpinner = findViewById(R.id.tv_selected_item);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang){

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                TextView tvdata = (TextView) super.getDropDownView(position,convertView,parent);
                if(position == 0){
                        tvdata.setTextColor(Color.GRAY);
                }else{

                        tvdata.setTextColor(Color.BLUE);
                }
                return tvdata;
            }
        };
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String strData = adapterView.getItemAtPosition(i).toString();
                if(i>=1) {
                    tvSpinner.setText("Selected Item is " + strData);
                }else{
                    tvSpinner.setText("");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}