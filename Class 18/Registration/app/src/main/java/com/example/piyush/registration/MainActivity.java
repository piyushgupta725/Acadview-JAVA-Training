package com.example.piyush.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText E1, E2, E3, E4;
    Button b1, b2;
    SharedPreferences sp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button);
        E1 = (EditText) findViewById(R.id.editText);
        E2 = (EditText) findViewById(R.id.editText1);
        E3 = (EditText) findViewById(R.id.editText5);
        E4 = (EditText) findViewById(R.id.editText3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }});
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("Pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("email", E1.getText().toString());
                ed.putString("Username", E2.getText().toString());
                ed.putString("Passward", E3.getText().toString());
                ed.putString("Phone", E4.getText().toString());
                ed.commit();
                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }
        });
    }
}