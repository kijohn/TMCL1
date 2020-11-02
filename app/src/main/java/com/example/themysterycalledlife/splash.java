package com.example.themysterycalledlife;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.DEBUG){
            StrictMode.ThreadPolicy old = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(old)
                    .permitDiskWrites()
                    .build());
            doCorrectStuffThatWritesToDisk();
            StrictMode.setThreadPolicy(old);
        }
        //Set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);


        //The splash screen code
        int SPLASH_SCREEN_TIME_OUT = 5000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(splash.this,
                    intro.class);
            startActivity(intent);
            finish();
        }, SPLASH_SCREEN_TIME_OUT);


    }

    private void doCorrectStuffThatWritesToDisk() {
    }
}


