package com.example.android.musicapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicapp.R;
import com.example.android.musicapp.Song;
import com.example.android.musicapp.nowplaying;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> androidSongs) {
        super(context, 0, androidSongs);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.itemlist, parent, false);
        }

        final Song currentSong = getItem(position);


        TextView songView = (TextView) listItemView.findViewById(R.id.song_name);
        songView.setText(currentSong.getSongName());
        songView.setSelected(true);


        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistView.setText(currentSong.getArtistName());
        artistView.setSelected(true);


        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), nowplaying.class);
                i.putExtra("songName", currentSong.getSongName());
                i.putExtra("artistName", currentSong.getArtistName());
                getContext().startActivity(i);
            }
        });

        return listItemView;
    }
}