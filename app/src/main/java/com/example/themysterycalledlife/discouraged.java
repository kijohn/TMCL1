package com.example.themysterycalledlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class discouraged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discouraged);

        TextView text1 = findViewById(R.id.textView16);
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2 = findViewById(R.id.textView18);
        text2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}