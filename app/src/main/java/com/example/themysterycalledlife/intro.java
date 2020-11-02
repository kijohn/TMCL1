package com.example.themysterycalledlife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(intro.this, menu.class);
            startActivity(intent);
        });
    }
}