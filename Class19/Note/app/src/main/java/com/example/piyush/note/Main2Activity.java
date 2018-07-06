package com.example.piyush.note;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String save = e.getText().toString();
                newNote(save);
            }
        });
    }
    void newNote(String save){
        try {
            SQLiteDatabase database = this.openOrCreateDatabase("NewDatabase", MODE_PRIVATE, null);
            database.execSQL("create table if not exists list (notetext VARCHAR)");
            database.execSQL("insert into list values('" + save + "')");
            Log.i("save","Done");
            Toast.makeText(getApplicationContext(),"saved",Toast.LENGTH_SHORT).show();
            Intent intentObj1 = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(intentObj1);
        }catch (Exception e){}
    }

}
