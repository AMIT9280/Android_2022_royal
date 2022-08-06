package com.hw_login_page.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hw_login_page.R;

public class LinearLoginPage extends AppCompatActivity {
    EditText  edtUserName;
    TextView textView;
    Button btnLogin;
    ImageView imgicon;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_login_page);

        edtUserName = findViewById(R.id.edt_email);
        btnLogin = findViewById(R.id.btn_login);
         textView = findViewById(R.id.T_login);
         imgicon = findViewById(R.id.img);
        radiogroup=findViewById(R.id.radgroup);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    int id =  radiogroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);

                    String strUsername = edtUserName.getText().toString();
                    String radiobutton = radioButton.getText().toString();
                    textView.setText(strUsername);
                    imgicon.setImageResource(R.drawable.ic_baseline_email_24);
                Toast.makeText(LinearLoginPage.this, "UserName Is"+strUsername, Toast.LENGTH_SHORT).show();

                //Explicit intent

                Intent i = new Intent(LinearLoginPage.this,HomeActivity.class);
                i.putExtra("KEY_USERNAME",strUsername);
                i.putExtra("KEY_GENDER",radiobutton);
                startActivity(i);
                //over Explicit intent
            }
        });
    }
}