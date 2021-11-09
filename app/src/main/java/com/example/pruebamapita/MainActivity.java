package com.example.pruebamapita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner lugares;
    Button Continue;
    ArrayList<String> lugar=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lugares=(Spinner) findViewById(R.id.lugares);
        Continue=(Button) findViewById(R.id.Continue);
        lugar.add("Coliseo");
        lugar.add("AREA51");
        lugar.add("Tokyo");
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,lugar);
        lugares.setAdapter(adaptador);

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lugares.getSelectedItem()=="....."){
                    Toast.makeText(getApplicationContext(),"Tiene que seleccionar lugar",Toast.LENGTH_LONG);
                }
                if (lugares.getSelectedItem()=="Coliseo"){
                    String lag=lugares.getSelectedItem().toString();
                    Intent I=new Intent(getApplicationContext(),pics.class);
                    I.putExtra("lugarr",lag);
                    startActivity(I);
                }
                if (lugares.getSelectedItem()=="AREA51"){
                    String lag=lugares.getSelectedItem().toString();
                    Intent I=new Intent(getApplicationContext(),pics2.class);
                    I.putExtra("lugarr",lag);
                    startActivity(I);
                }
                if (lugares.getSelectedItem()=="Tokyo"){
                    String lag=lugares.getSelectedItem().toString();
                    Intent I=new Intent(getApplicationContext(),pics3.class);
                    I.putExtra("lugarr",lag);
                    startActivity(I);
                }
            }
        });
    }
}