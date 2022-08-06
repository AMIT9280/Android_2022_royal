package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.hw_login_page.Adapter.MyFlagAdapter;
import com.hw_login_page.R;
import com.hw_login_page.model.conModel;

import java.util.ArrayList;

public class custSpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    String Country []= {"India","Pakistan","Japan","China","Dubai"};
    int CImg [] = {R.drawable.ind,R.drawable.pok,R.drawable.japan,R.drawable.china,R.drawable.dubai};
    ArrayList<conModel> conModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_spinner);

         spinner= findViewById(R.id.spinner);

         conModelArrayList = new ArrayList<conModel>();

         for (int i=0; Country.length>i; i++){
             conModel conModel = new conModel(Country[i],CImg[i]);
             conModelArrayList.add(conModel);
         }
         MyFlagAdapter myFlagAdapter =new MyFlagAdapter(this,conModelArrayList);

            spinner.setAdapter((SpinnerAdapter) myFlagAdapter);
    }
}