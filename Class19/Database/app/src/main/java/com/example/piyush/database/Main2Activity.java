package com.example.piyush.database;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity {
    EditText id,user;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        id = (EditText)findViewById(R.id.editText5);
        user=(EditText)findViewById(R.id.editText4);
        login=(Button)findViewById(R.id.button3);
    }
}