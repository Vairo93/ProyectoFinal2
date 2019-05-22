package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bosque4 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent bosque1,bosque5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque4);

        bAbajo = findViewById(R.id.arriba);
        bIzquierda = findViewById(R.id.izquierda1);
        bDerecha = findViewById(R.id.derecha1);

        bosque1 = new Intent( this, Bosque1.class);
        bosque5 = new Intent( this, Bosque5.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque1);
            }
        });

        bDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque5);
            }
        });
    }
}
