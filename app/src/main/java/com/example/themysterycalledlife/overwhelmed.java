package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class overwhelmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overwhelmed);

        TextView txt1 = findViewById(R.id.textView67);
        txt1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt2 = findViewById(R.id.textView81);
        txt2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}