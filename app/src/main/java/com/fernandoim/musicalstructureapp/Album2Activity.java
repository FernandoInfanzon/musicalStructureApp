package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Speak to Me","Pink Floyd"));
        songs.add(new Song("Breathe","Pink Floyd"));
        songs.add(new Song("On the Run","Pink Floyd"));
        songs.add(new Song("Time","Pink Floyd"));
        songs.add(new Song("The Great Gig in the Sky","Pink Floyd"));
        songs.add(new Song("Money","Pink Floyd"));
        songs.add(new Song("Us and Them","Pink Floyd"));
        songs.add(new Song("Any Colour You Like","Pink Floyd"));
        songs.add(new Song("Brain Damage","Pink Floyd"));
        songs.add(new Song("Eclipse","Pink Floyd"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}