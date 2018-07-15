package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.android.musicapp.R;
import com.example.android.musicapp.Song;
import com.example.android.musicapp.SongAdapter;

import java.util.ArrayList;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlist);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("I Swear", "John Michael Montgomery"));
        songs.add(new Song("Coward Of The County", "Kenny Rogers"));
        songs.add(new Song("Skip A Rope", "Henson Cargill"));
        songs.add(new Song("Watching You", "Rodney Atkins"));
        songs.add(new Song("How Do You Like Me Now?!", "Toby Keith"));
        songs.add(new Song("Check Yes Or No", "George Strait"));
        songs.add(new Song("Kiss An Angel Good Mornin'", "Charley Pride"));
        songs.add(new Song("Almost Persuaded", "David Houston"));
        songs.add(new Song("Rose Garden", "Lynn Anderson"));
        songs.add(new Song("Here You Come Again", "Dolly Parton"));
        songs.add(new Song("Ain't Nothing 'Bout You", "Brooks & Dunn"));
        songs.add(new Song("Give Me Wings", "Michael Johnson"));
        songs.add(new Song("Just To See You Smile", "Tim McGraw"));
        songs.add(new Song("Chattahoochee", "Alan Jackson"));
        songs.add(new Song("Don't Blink", "Kenny Chesney"));
        songs.add(new Song("The Good Stuff", "Kenny Chesney"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}