package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bosque5 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent bosque4,bosque6, bosque2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque5);

        bAbajo = findViewById(R.id.arriba6);
        bIzquierda = findViewById(R.id.izquierda6);
        bDerecha = findViewById(R.id.derecha6);

        bosque2 = new Intent( this, Bosque2.class);
        bosque6 = new Intent( this, Bosque6.class);
        bosque4 = new Intent( this, Bosque4.class);


        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque2);
            }
        });

        bDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque6);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque4);
            }
        });
    }
}
