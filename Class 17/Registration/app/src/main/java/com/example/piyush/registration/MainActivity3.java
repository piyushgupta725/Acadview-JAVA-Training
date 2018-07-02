package com.example.piyush.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView T1;
String s1="",s2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        T1=findViewById(R.id.textView);

        Bundle b = getIntent().getExtras();

        s1= b.getString("User");
        s2= b.getString("Pass");


        if(s1.equals("Admin") && s2.equals("Password")){

            T1.setText("Welcome"+s1+"You are Logged In");
        }
        else{
            T1.setText("Incorrect Username and Passsward");
        }
        }

    }

