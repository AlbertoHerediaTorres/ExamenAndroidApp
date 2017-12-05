package com.example.alberto.examenandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class JugarActivity extends AppCompatActivity {

    String [] palabra = {"árbol","uva", "manzana", "clase", "pizarra", "profesor", "ordenador", "persiana", "banco", "mercado", "mujer", "niño", "casa", "teléfono", "pala"};
    TextView tV1;
    TextView tV2;
    TextView tV3;
    TextView tV4;
    TextView tV5;
    TextView tV6;
    TextView tV7;
    TextView tV8;
    TextView tV9;
    TextView tV10;
    TextView tV11;
    TextView tV12;
    TextView tV13;
    TextView tV14;
    TextView tV15;
    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);
        declararComponentes();
        cargarPalabras();


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Jugar2Activity.class);
                startActivity(i);
            }
        });
    }

    private void cargarPalabras(){

        String random;
        tV1.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV2.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV3.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV4.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV5.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV6.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV7.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV8.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV9.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV10.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV11.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV12.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV13.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV14.setText(random = (palabra[new Random().nextInt(palabra.length)]));
        tV15.setText(random = (palabra[new Random().nextInt(palabra.length)]));



    }


    private void declararComponentes(){

        tV1 = (TextView)findViewById(R.id.tV1);
        tV2 = (TextView)findViewById(R.id.tV2);
        tV3 = (TextView)findViewById(R.id.tV3);
        tV4 = (TextView)findViewById(R.id.tV4);
        tV5 = (TextView)findViewById(R.id.tV5);
        tV6 = (TextView)findViewById(R.id.tV6);
        tV7 = (TextView)findViewById(R.id.tV7);
        tV8 = (TextView)findViewById(R.id.tV8);
        tV9 = (TextView)findViewById(R.id.tV9);
        tV10 = (TextView)findViewById(R.id.tV10);
        tV11 = (TextView)findViewById(R.id.tV11);
        tV12 = (TextView)findViewById(R.id.tV12);
        tV13 = (TextView)findViewById(R.id.tV13);
        tV14 = (TextView)findViewById(R.id.tV14);
        tV15 = (TextView)findViewById(R.id.tV15);

        siguiente = (Button)findViewById(R.id.btnSiguiente);

    }
}
