package com.example.piyush.database;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

import static com.example.piyush.database.DBHelper.NAME;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText id,name,email,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button);
        id = (EditText) findViewById(R.id.editText);
        name= (EditText) findViewById(R.id.editText1);
        email= (EditText) findViewById(R.id.editText5);
        phone = (EditText) findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper db=new DBHelper(getApplicationContext());
                contacts con=new contacts("id.getText()","name.getText().toString()","email.getText().toString()","phone.getText().toString()");
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        }); }


    }

