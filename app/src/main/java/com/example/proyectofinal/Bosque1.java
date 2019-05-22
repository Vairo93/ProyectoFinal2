package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bosque1 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent bosque2,bosque4,fuente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque1);

        bAbajo = findViewById(R.id.abajoFuente);
        bIzquierda = findViewById(R.id.izquierda1);
        bDerecha = findViewById(R.id.derecha1);

        fuente = new Intent( Bosque1.this, MainActivity.class);
        bosque2 = new Intent( Bosque1.this, Bosque2.class);
        bosque4 = new Intent(Bosque1.this, Bosque4.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque4);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fuente);
            }
        });

        bDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque2);
            }
        });

    }
}
