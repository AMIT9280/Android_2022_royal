package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hw_login_page.R;
import com.hw_login_page.fragments.calls_Fragment;
import com.hw_login_page.fragments.chat_Fragment;
import com.hw_login_page.fragments.status_Fragment;

public class wp_fragmentActivity extends AppCompatActivity {
    Button btn_chat,btn_status,btn_calls;
    View v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp_fragment);

        btn_chat = findViewById(R.id.btn_chat);
        btn_status = findViewById(R.id.btn_status);
        btn_calls = findViewById(R.id.btn_calls);
        v1 = findViewById(R.id.v_1);
        v2 = findViewById(R.id.v_2);
        v3 = findViewById(R.id.v_3);

        btn_chat.setFocusable(true);
        btn_chat.setFocusableInTouchMode(true);
        btn_chat.requestFocus();

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chat_Fragment chat_Fragment = new chat_Fragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,chat_Fragment);
                fragmentTransaction.commit();
                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.INVISIBLE);
                v3.setVisibility(View.INVISIBLE);
            }
        });
        btn_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                status_Fragment status_fragment = new status_Fragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,status_fragment);
                fragmentTransaction.commit();
                v1.setVisibility(View.INVISIBLE);
                v2.setVisibility(View.VISIBLE);
                v3.setVisibility(View.INVISIBLE);
            }
        });
        btn_calls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calls_Fragment calls_fragment = new calls_Fragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,calls_fragment);
                fragmentTransaction.commit();
                v1.setVisibility(View.INVISIBLE);
                v2.setVisibility(View.INVISIBLE);
                v3.setVisibility(View.VISIBLE);
            }
        });

    }
}