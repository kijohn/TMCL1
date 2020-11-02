package com.example.themysterycalledlife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class motivation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        Button btn1 = findViewById(R.id.button26);
        Button btn2 = findViewById(R.id.button25);
        Button btn3 = findViewById(R.id.button24);
        Button btn4 = findViewById(R.id.button23);
        Button btn5 = findViewById(R.id.button22);
        Button btn6 = findViewById(R.id.button21);
        Button btn7 = findViewById(R.id.button20);
        Button btn8 = findViewById(R.id.button19);
        Button btn9 = findViewById(R.id.button18);
        Button btn10 = findViewById(R.id.button17);
        Button btn11 = findViewById(R.id.button12);

        btn1.setOnClickListener(v -> {
            Intent int1 = new Intent(motivation.this, happiness.class);
            startActivity(int1);
        });
        btn2.setOnClickListener(v -> {
            Intent int2 = new Intent(motivation.this, goals.class);
            startActivity(int2);
        });
        btn3.setOnClickListener(v -> {
            Intent int3 = new Intent(motivation.this, success.class);
            startActivity(int3);
        });
        btn4.setOnClickListener(v -> {
            Intent int4 = new Intent(motivation.this, failure.class);
            startActivity(int4);
        });
        btn5.setOnClickListener(v -> {
            Intent int5 = new Intent(motivation.this, determination.class);
            startActivity(int5);
        });
        btn6.setOnClickListener(v -> {
            Intent int6 = new Intent(motivation.this, being_you.class);
            startActivity(int6);
        });
        btn7.setOnClickListener(v -> {
            Intent int7 = new Intent(motivation.this, believing.class);
            startActivity(int7);
        });
        btn8.setOnClickListener(v -> {
            Intent int8 = new Intent(motivation.this, change.class);
            startActivity(int8);
        });
        btn9.setOnClickListener(v -> {
            Intent int9 = new Intent(motivation.this, purpose.class);
            startActivity(int9);
        });
        btn10.setOnClickListener(v -> {
            Intent int10 = new Intent(motivation.this, friends.class);
            startActivity(int10);
        });
        btn11.setOnClickListener(v -> {
            Intent int11 = new Intent(motivation.this, truth.class);
            startActivity(int11);
        });
    }
}