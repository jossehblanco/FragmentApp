package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text, text2;
    ImageView img;
    Planet planet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textId);
        text2 = findViewById(R.id.textId2);
        img = findViewById(R.id.planetIMG);
        Intent intent = getIntent();
        planet = intent.getParcelableExtra("Holi");
        text.setText(planet.planetName);
        img.setImageResource(planet.imageRes);
        text2.setText(planet.planetInfo);
    }
}
