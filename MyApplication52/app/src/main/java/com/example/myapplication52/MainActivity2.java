package com.example.myapplication52;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView A = findViewById(R.id.Fill);
        TextView B = findViewById(R.id.Name);
        TextView C = findViewById(R.id.Age);
        TextView D = findViewById(R.id.Job);
        Button E = findViewById(R.id.Num);
        Button F = findViewById(R.id.mail);
        Button G = findViewById(R.id.Back);

        Bundle t = getIntent().getExtras();
        String name = t.getString("name");
        B.setText(name);

        Bundle q = getIntent().getExtras();
        String age = q.getString("age");
        C.setText(age);

        Bundle m = getIntent().getExtras();
        String Job = m.getString("Job");
        D.setText(Job);

        Bundle l = getIntent().getExtras();
        String Num = l.getString("Num");
        E.setText(Num);

        Bundle Q = getIntent().getExtras();
        String mail = Q.getString("mail");
        F.setText(mail);

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("call"));
                startActivity(intent);
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent G = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(G);
                overridePendingTransition(R.anim.left, R.anim.outright);
            }
        });
    }
}