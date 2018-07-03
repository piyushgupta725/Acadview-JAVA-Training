package com.example.piyush.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText E1,E2;
    SharedPreferences sp;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        E1=(EditText)findViewById(R.id.editText5);
        E2=(EditText)findViewById(R.id.editText4);
        B1=(Button)findViewById(R.id.button3);

        sp = getSharedPreferences("Pref", MODE_PRIVATE);
        final String user = sp.getString("Username","");
        final String pass = sp.getString("Passward","");



        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s1= E1.getText().toString();
                final String s2=E2.getText().toString();
                if((user.equals(s1))&&(pass.equals(s2))) {
                    Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Not Registered Email",Toast.LENGTH_SHORT).show();
                }
                }


        });
        }

    }

