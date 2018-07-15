package com.example.android.musicapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicapp.R;

public class nowplaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        Bundle extras = getIntent().getExtras();

        String currentSongName = extras.getString("songName");
        TextView songView = (TextView) findViewById(R.id.current_song_name);

        String currentArtistName = extras.getString("artistName");
        TextView artistView = (TextView) findViewById(R.id.current_song_artist);

        songView.setText(currentSongName);
        artistView.setText(currentArtistName);

        ImageView backButton = (ImageView) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}