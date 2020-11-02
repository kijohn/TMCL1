package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class rejected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejected);

        TextView txt = findViewById(R.id.textView32);
        txt.setMovementMethod(LinkMovementMethod.getInstance());
    }
}