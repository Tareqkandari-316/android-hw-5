package com.example.myapplication52;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView A = findViewById(R.id.imageView3);
        TextView b = findViewById(R.id.Fill);
        final EditText c =findViewById(R.id.Name);
        final EditText d =findViewById(R.id.Age);
        final EditText e =findViewById(R.id.Job);
        final EditText f = findViewById(R.id.Num);
        final EditText g = findViewById(R.id.mail);
        final Button H = findViewById(R.id.Next);


        H.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent K = new Intent(MainActivity.this,MainActivity2.class);
                K.putExtra("name", c.getText().toString());
                K.putExtra("age", d.getText().toString());
                K.putExtra("Job",e.getText().toString());
                K.putExtra("Num", f.getText().toString());
                K.putExtra("mail", g.getText().toString());
                startActivity(K);
                overridePendingTransition(R.anim.right, R.anim.outleft);

            }
        });
    }
}