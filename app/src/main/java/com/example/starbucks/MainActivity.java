package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStarAme, btnStarVanilla, btnStarCafemoca, btnStarDolce, btnStarToffenut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStarAme = findViewById(R.id.btnStarAme);
        btnStarVanilla = findViewById(R.id.btnStarVanilla);
        btnStarCafemoca = findViewById(R.id.btnStarCafemoca);
        btnStarDolce = findViewById(R.id.btnStarDolce);
        btnStarToffenut = findViewById(R.id.btnStarToffenut);

        btnStarAme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnStarVanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnStarCafemoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnStarDolce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnStarToffenut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}