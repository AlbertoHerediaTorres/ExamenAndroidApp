package com.example.alberto.examenandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Jugar2Activity extends JugarActivity {

    EditText cajaPalabra;
    Button validar;
    TextView lista;
    boolean escrito = false;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar2);
        declararComponentes();

        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(escrito){
            if(cajaPalabra.equals(tV1) || cajaPalabra.equals(tV2)){
                String dato = cajaPalabra.getText().toString();
                lista.setText(""+dato);
            }
                }else {
                Toast.makeText(getApplicationContext(),"Tienes que escribir una palabra", Toast.LENGTH_LONG).show();
            }
            }
        });
    }

    private void declararComponentes () {
        cajaPalabra = (EditText)findViewById(R.id.cajaPalabra);
        validar = (Button)findViewById(R.id.btnValidar);
        lista = (TextView)findViewById(R.id.tVListaAcertadas);
    }
}
