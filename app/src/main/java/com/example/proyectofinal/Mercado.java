package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mercado extends AppCompatActivity {

    ImageButton mIzquierda, mAbajo;
    Intent barrioMagia, entradaBosque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado);

        mIzquierda = findViewById(R.id.izquierda9);


        barrioMagia = new Intent(this, BarrioMagia.class);

        mIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(barrioMagia);
            }
        });


    }
}
