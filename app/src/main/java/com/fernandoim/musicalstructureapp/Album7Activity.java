package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Taxman","The Beatles."));
        songs.add(new Song("Eleanor Rigby","The Beatles."));
        songs.add(new Song("I'm Only Sleeping","The Beatles."));
        songs.add(new Song("Love You To","The Beatles."));
        songs.add(new Song("Here, There and Everywhere","The Beatles."));
        songs.add(new Song("Yellow Submarine","The Beatles."));
        songs.add(new Song("She Said She Said","The Beatles."));
        songs.add(new Song("Good Day Sunshine","The Beatles."));
        songs.add(new Song("And Your Bird Can Sing","The Beatles."));
        songs.add(new Song("For No One","The Beatles."));
        songs.add(new Song("Doctor Robert","The Beatles."));
        songs.add(new Song("I Want to Tell You","The Beatles."));
        songs.add(new Song("Got to Get You into My Life","The Beatles."));
        songs.add(new Song("Tomorrow Never Knows","The Beatles."));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}