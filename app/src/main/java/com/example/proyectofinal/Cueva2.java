package com.example.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cueva2 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda;
    Intent cueva1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cueva2);

        bIzquierda = findViewById(R.id.izquierda6);

        cueva1 = new Intent( this, Cueva1.class);

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cueva1);
            }
        });
    }
}
