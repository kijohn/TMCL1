package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class self_doubt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_doubt);

        TextView txt1 = findViewById(R.id.textView38);
        txt1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt2 = findViewById(R.id.textView37);
        txt2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}