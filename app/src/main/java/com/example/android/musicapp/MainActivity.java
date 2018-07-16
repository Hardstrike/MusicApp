package com.example.android.musicapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.musicapp.R;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView country = (TextView) findViewById(R.id.Country);
        TextView jazz = (TextView) findViewById(R.id.Jazz);
        TextView instrumental = (TextView) findViewById(R.id.Instrumental);
        TextView pop = (TextView) findViewById(R.id.Pop);

        country.setOnClickListener(this);
        jazz.setOnClickListener(this);
        instrumental.setOnClickListener(this);
        pop.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Country:

                Intent countryIntent = new Intent(MainActivity.this, Country.class);

                startActivity(countryIntent);

                break;
            case R.id.Jazz:

                Intent jazzIntent = new Intent(MainActivity.this, com.example.android.musicapp.Jazz.class);

                startActivity(jazzIntent);

                break;
            case R.id.Instrumental:

                Intent instrumentalIntent = new Intent(MainActivity.this, Instrumental.class);

                startActivity(instrumentalIntent);

                break;
            case R.id.Pop:

                Intent PopIntent = new Intent(MainActivity.this, Pop.class);

                startActivity(PopIntent);

                break;
        }
    }
}