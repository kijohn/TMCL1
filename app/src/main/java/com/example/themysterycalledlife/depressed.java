package com.example.themysterycalledlife;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class depressed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depressed);

        TextView text = findViewById(R.id.textView14);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}