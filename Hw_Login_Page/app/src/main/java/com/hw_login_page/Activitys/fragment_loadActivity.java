package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hw_login_page.R;
import com.hw_login_page.fragments.A_FragmentMainActivity;
import com.hw_login_page.fragments.B_FragmentMainActivity;

public class fragment_loadActivity extends AppCompatActivity {

    Button btn_a,btn_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_load);
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_FragmentMainActivity aFragmentMainActivity = new A_FragmentMainActivity();
                FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,aFragmentMainActivity);
                fragmentTransaction.commit();
            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_FragmentMainActivity bFragmentMainActivity = new B_FragmentMainActivity();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,bFragmentMainActivity);
                fragmentTransaction.commit();
            }
        });
    }
}