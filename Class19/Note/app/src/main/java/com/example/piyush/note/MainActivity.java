package com.example.piyush.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button t,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (Button)findViewById(R.id.button1);
        s = (Button)findViewById(R.id.button2);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentObj = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intentObj);
                }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentObj1 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intentObj1);
                }
        });

    }
}