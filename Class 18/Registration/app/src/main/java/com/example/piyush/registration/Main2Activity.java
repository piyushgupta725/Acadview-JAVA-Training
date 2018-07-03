package com.example.piyush.registration;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView x,y,z,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
        x=(TextView)findViewById(R.id.a);
        y=(TextView)findViewById(R.id.b);
        z=(TextView)findViewById(R.id.c);
        n=(TextView)findViewById(R.id.d);


       SharedPreferences sp = getSharedPreferences("Pref", MODE_PRIVATE);
        final String e = sp.getString("email","");
        final String p = sp.getString("Passward","");
        final String u = sp.getString("Username","");
        final String c= sp.getString("Phone","");

        x.setText(e);
        y.setText(p);
        z.setText(u);
        n.setText(c);



    }
}
