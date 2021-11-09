package com.example.pruebamapita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pics3 extends AppCompatActivity {
    Button button4;
    String lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pics3);
        button4=(Button) findViewById(R.id.button3);
        Bundle u=getIntent().getExtras();
        lugares=u.getString("lugarr");

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);
            }
        });
    }
}