package com.example.piyush.registration;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b;
EditText E1,E2;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        E1=(EditText)findViewById(R.id.editText);
        E2=(EditText)findViewById(R.id.editText3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,MainActivity3.class);
                i.putExtra("User",E1.getText().toString());
                i.putExtra("Pass",E2.getText().toString());
                startActivity(i);
                }
        });
    }
}
