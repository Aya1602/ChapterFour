package com.example.chapterfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // получение ресурсов из файла values/strings.xml
        String app_name = getResources().getString(R.string.app_name);

        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(app_name);

        setContentView(textView);

    }
}