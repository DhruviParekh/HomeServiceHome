package com.example.homeservicehome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub_kitchen extends AppCompatActivity {
    Button kadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_kitchen);

        kadd = findViewById(R.id.kitchen_cart);
        kadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sub_kitchen.this,Finalcart.class);
                startActivity(intent);
            }
        });
    }
}