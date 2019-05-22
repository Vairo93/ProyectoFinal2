package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bosque6 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda;
    Intent bosque3,bosque5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque6);

        bAbajo = findViewById(R.id.arriba6);
        bIzquierda = findViewById(R.id.izquierda6);

        bosque3 = new Intent( this, Bosque3.class);
        bosque5 = new Intent( this, Bosque5.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque3);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque5);
            }
        });
    }
}
