package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Castillo extends AppCompatActivity {

    ImageButton mDerecha;
    Intent fuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castillo);

        mDerecha = findViewById(R.id.derecha4);
        fuente = new Intent(this, MainActivity.class);

        mDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fuente);
            }
        });

    }
}
