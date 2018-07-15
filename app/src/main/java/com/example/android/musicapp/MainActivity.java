package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.android.musicapp.Country;
import com.example.android.musicapp.Instrumental;
import com.example.android.musicapp.Pop;
import com.example.android.musicapp.R;
import com.example.android.musicapp.Jazz;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView country = (TextView) findViewById(R.id.Country);

        country.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent countryIntent = new Intent(MainActivity.this, Country.class);

                startActivity(countryIntent);
            }
        });

        TextView jazz = (TextView) findViewById(R.id.Jazz);

        jazz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jazzIntent = new Intent(MainActivity.this, com.example.android.musicapp.Jazz.class);

                startActivity(jazzIntent);
            }
        });

        TextView instrumental = (TextView) findViewById(R.id.Instrumental);

        instrumental.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent instrumentalIntent = new Intent(MainActivity.this, Instrumental.class);

                startActivity(instrumentalIntent);
            }
        });

        TextView pop = (TextView) findViewById(R.id.Pop);

        pop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent PopIntent = new Intent(MainActivity.this, Pop.class);

                startActivity(PopIntent);
            }
        });
    }
}