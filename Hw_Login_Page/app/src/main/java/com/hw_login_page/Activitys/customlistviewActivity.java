package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.hw_login_page.model.LangModel;
import com.hw_login_page.Adapter.MyBaseAdapter;
import com.hw_login_page.R;

import java.util.ArrayList;

public class customlistviewActivity extends AppCompatActivity {

    ListView listView;

    String strLang[] = {"Android","Java","PHP","C","C++","IOS","Python"};
    int imgLangList[]={R.drawable.android,R.drawable.java,R.drawable.php,R.drawable.c,R.drawable.cpp,R.drawable.ios,
            R.drawable.python};

    ArrayList<LangModel> langModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlistview);
        listView = findViewById(R.id.list_view);

        langModelArrayList = new ArrayList<LangModel>();
        for (int i =0; strLang.length>i; i++){
                LangModel langModel = new LangModel(strLang[i],imgLangList[i]);
                langModelArrayList.add(langModel);
        }
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this,langModelArrayList);
            listView.setAdapter(myBaseAdapter);
    }
}