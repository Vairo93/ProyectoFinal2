package com.example.proyectofinal;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton mArriba, mAbajo, mDerecha, mIzquierda;
    Intent magia, casa_semilla, castillo, bosque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArriba = findViewById(R.id.arriba);
        mDerecha = findViewById(R.id.derecha20);
        mAbajo = findViewById(R.id.abajo);
        mIzquierda = findViewById(R.id.izquierda);

        magia = new Intent(MainActivity.this, BarrioMagia.class);
        casa_semilla = new Intent(MainActivity.this, CasaSenyorHuerto.class);
        castillo = new Intent(MainActivity.this, Castillo.class);
        bosque = new Intent(MainActivity.this, Bosque1.class);

        mArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(magia);

            }
        });

        mDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque);
            }
        });

        mAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(casa_semilla);
            }
        });

        mIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(castillo);
            }
        });

    }



}
