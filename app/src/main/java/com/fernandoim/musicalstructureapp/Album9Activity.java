package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Shine On You Crazy Diamond (Parts I–V)","Pink Floyd"));
        songs.add(new Song("Welcome to the Machine","Pink Floyd"));
        songs.add(new Song("Have a Cigar","Pink Floyd"));
        songs.add(new Song("Wish You Were Here","Pink Floyd"));
        songs.add(new Song("Shine On You Crazy Diamond (Parts VI–IX)","Pink Floyd"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}