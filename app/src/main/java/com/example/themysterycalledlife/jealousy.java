package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class jealousy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jealousy);

        TextView txt1 = findViewById(R.id.textView43);
        txt1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView txt2 = findViewById(R.id.textView62);
        txt2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}