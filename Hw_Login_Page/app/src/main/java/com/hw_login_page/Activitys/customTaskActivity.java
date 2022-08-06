package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.hw_login_page.Adapter.MyBaseAdapter2;
import com.hw_login_page.R;
import com.hw_login_page.model.RecModel;

import java.util.ArrayList;

public class customTaskActivity extends AppCompatActivity {

    ListView listView;
    String RecData []= {"Crunchy Croissants","Grilled Eggplant","Tangerine salad","Pomegranate Juice","Chilli Salsa","Flour from scratch","Peach Empanada"};
    int ImgData [] = {R.drawable.crunchy,R.drawable.grilledeggplant,R.drawable.tangerinesalad,R.drawable.pomegranatejuice,
            R.drawable.chillisalsa,R.drawable.flourfromscratch,R.drawable.peachempanada};
    String RecDec []= {"A","b","c","d","e","f","g"};
    ArrayList<RecModel> RecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_task);
        listView = findViewById(R.id.list_view);

        RecModelArrayList = new ArrayList<RecModel>();
        for (int i =0; RecData.length>i; i++){
            RecModel RecModel = new RecModel(RecData[i],ImgData[i],RecDec[i]);
            RecModelArrayList.add(RecModel);
        }
        MyBaseAdapter2 myBaseAdapter2 = new MyBaseAdapter2(this,RecModelArrayList);
        listView.setAdapter(myBaseAdapter2);
    }
    }