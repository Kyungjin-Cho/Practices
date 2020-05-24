package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Wow!");
        textView.setTextSize(56);
        textView.setTextColor(Color.GREEN);
        textView.setMaxLines(2);

        setContentView(textView);
    }
}
