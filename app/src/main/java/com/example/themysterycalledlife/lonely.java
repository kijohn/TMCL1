package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class lonely extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lonely);

        TextView txt1t = findViewById(R.id.textView65);
        txt1t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt2 = findViewById(R.id.textView64);
        txt2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt3 = findViewById(R.id.textView79);
        txt3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt4 = findViewById(R.id.textView80);
        txt4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}