package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bosque3 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent bosque2,cueva1,bosque6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque3);

        bAbajo = findViewById(R.id.abajoFuente);
        bIzquierda = findViewById(R.id.izquierda1);
        bDerecha = findViewById(R.id.derecha1);

        bosque2 = new Intent( this, Bosque2.class);
        bosque6 = new Intent( this, Bosque6.class);
        cueva1 = new Intent(this, Cueva1.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque6);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque2);
            }
        });

        bDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cueva1);
            }
        });

    }
}
