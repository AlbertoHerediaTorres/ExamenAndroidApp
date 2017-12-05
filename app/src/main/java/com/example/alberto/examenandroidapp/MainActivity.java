package com.example.alberto.examenandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jugar;
    Button puntuaciones;
    Button configurar;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declararComponentes();

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),JugarActivity.class);
                startActivity(i);
            }
        });

        puntuaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PuntuacionesActivity.class);
                startActivity(i);
            }
        });

        configurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ConfigurarActivity.class);
                startActivity(i);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();
            }
        });
    }

    private void declararComponentes(){
        jugar = (Button)findViewById(R.id.btnJugar);
        puntuaciones = (Button)findViewById(R.id.btnPuntuacion);
        configurar = (Button)findViewById(R.id.btnConfigurar);
        salir = (Button)findViewById(R.id.btnSalir);

    }
}
