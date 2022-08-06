package com.hw_login_page.Activitys;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hw_login_page.R;

public class AlertActivity extends AppCompatActivity {
    Button btnalert,btnctmToast;
    Button btnCustomeAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnalert = findViewById(R.id.btn_alert);
        btnCustomeAlert = findViewById(R.id.btn_custom);
        btnctmToast = findViewById(R.id.btn_custom_toast);
        btnctmToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater = getLayoutInflater();
                View myToast = layoutInflater.inflate(R.layout.raw_toast,null   );
                Toast toast = new Toast(AlertActivity.this);
                toast.setView(myToast);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        btnCustomeAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater  layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_custom_dailog,null);
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                alertDialog.setView(myview);
                Button btnCancel  = myview.findViewById(R.id.btn_cancel);
                Button btnSearch = myview.findViewById(R.id.btn_search);
                EditText edtUser = myview.findViewById(R.id.edt_mail);
                btnSearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String strEmail = edtUser.getText().toString();
                        View myToast = layoutInflater.inflate(R.layout.raw_toast,null   );
                        Toast toast = new Toast(AlertActivity.this);
                        TextView tvData = myToast.findViewById(R.id.tv_data);
                        tvData.setText(strEmail);
                        toast.setView(myToast);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.show();
                        if (alertDialog.isShowing()) {
                            alertDialog.dismiss();
                        }
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                    }
                });
                alertDialog.show();
            }
        });
        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setIcon(R.drawable.ic_person);
                builder.setTitle("Alert Dialog");
                builder.setMessage("Are You Sure, You Want to delete this File?");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this,"Yes Is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                             Toast.makeText(AlertActivity.this,"NO",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });
    }
}