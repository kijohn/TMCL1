package com.example.themysterycalledlife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class menu extends AppCompatActivity {
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn1 = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button16);

        btn1.setOnClickListener(v -> {
            Intent int1 = new Intent(menu.this, feeling.class);
            startActivity(int1);
        });
        btn2.setOnClickListener(v -> {
            Intent int2 = new Intent(menu.this, motivation.class);
            startActivity(int2);
        });
        btn3.setOnClickListener(v -> {
            Intent int3 = new Intent(menu.this, share.class);
            startActivity(int3);
        });
        MobileAds.initialize(this, initializationStatus -> {
        });
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }
}