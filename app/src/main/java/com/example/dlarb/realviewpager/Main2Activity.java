package com.example.dlarb.realviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String title, content;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.dt_tv);
        tv2=findViewById(R.id.dt_tv2);
        Intent intent = getIntent();
        title= intent.getStringExtra("title");
        content=intent.getStringExtra("content");

        tv.setText(title);
        tv2.setText(content);
    }
}
