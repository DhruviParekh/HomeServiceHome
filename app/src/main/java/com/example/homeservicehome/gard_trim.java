package com.example.homeservicehome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gard_trim extends AppCompatActivity {
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gard_trim);

        add = findViewById(R.id.trim_cart);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gard_trim.this,Finalcart.class);
                startActivity(intent);
            }
        });
    }
}