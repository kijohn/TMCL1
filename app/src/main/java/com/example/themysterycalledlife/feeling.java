package com.example.themysterycalledlife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class feeling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling);


        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button5);
        Button btn3 = findViewById(R.id.button6);
        Button btn4 = findViewById(R.id.button7);
        Button btn5 = findViewById(R.id.button8);
        Button btn6 = findViewById(R.id.button9);
        Button btn7 = findViewById(R.id.button10);
        Button btn8 = findViewById(R.id.button11);
        Button btn10 = findViewById(R.id.button13);
        Button btn11 = findViewById(R.id.button14);


        btn1.setOnClickListener(v -> {
            Intent int1 = new Intent(feeling.this, depressed.class);
            startActivity(int1);
        });
        btn2.setOnClickListener(v -> {
            Intent int2 = new Intent(feeling.this, discouraged.class);
            startActivity(int2);
        });
        btn3.setOnClickListener(v -> {
            Intent int3 = new Intent(feeling.this, giving_up.class);
            startActivity(int3);
        });
        btn4.setOnClickListener(v -> {
            Intent int4 = new Intent(feeling.this, rejected.class);
            startActivity(int4);
        });
        btn5.setOnClickListener(v -> {
            Intent int5 = new Intent(feeling.this, self_doubt.class);
            startActivity(int5);
        });
        btn6.setOnClickListener(v -> {
            Intent int6 = new Intent(feeling.this, feeling_useless.class);
            startActivity(int6);
        });
        btn7.setOnClickListener(v -> {
            Intent int7 = new Intent(feeling.this, vengeful.class);
            startActivity(int7);
        });
        btn8.setOnClickListener(v -> {
            Intent int8 = new Intent(feeling.this, jealousy.class);
            startActivity(int8);
        });
        btn10.setOnClickListener(v -> {
            Intent int10 = new Intent(feeling.this, lonely.class);
            startActivity(int10);
        });
        btn11.setOnClickListener(v -> {
            Intent int11 = new Intent(feeling.this, overwhelmed.class);
            startActivity(int11);
        });
    }
}
