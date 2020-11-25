package com.example.belajaribadah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    CardView btnwudhu;
    CardView btnsholat;
    CardView web;
    CardView web2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnwudhu = (findViewById(R.id.wudhucardid));
        btnwudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityWudhu.class));
            }
        });

        btnsholat = (findViewById(R.id.sholatcardid));
        btnsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivitySholat.class));
            }
        });

        web = (findViewById(R.id.webvideo));
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityVideo.class));
            }
        });

        web2 = (findViewById(R.id.webvideo1));
        web2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityVideo1.class));
            }
        });
    }
}
