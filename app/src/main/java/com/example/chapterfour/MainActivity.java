package com.example.chapterfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем элемент textView
        TextView textView = (TextView) findViewById(R.id.textView);
        // переустанавливаем у него текст
        textView.setText(R.string.message);
    }
}