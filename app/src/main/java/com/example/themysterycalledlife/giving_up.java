package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class giving_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giving_up);
        TextView text = findViewById(R.id.textView24);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}