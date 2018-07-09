package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Thunder Road","Bruce Springsteen"));
        songs.add(new Song("Tenth Avenue Freeze-Out","Bruce Springsteen"));
        songs.add(new Song("Night","Bruce Springsteen"));
        songs.add(new Song("Backstreets","Bruce Springsteen"));
        songs.add(new Song("Born to Run","Bruce Springsteen"));
        songs.add(new Song("She's the One","Bruce Springsteen"));
        songs.add(new Song("Meeting Across the River","Bruce Springsteen"));
        songs.add(new Song("Jungleland","Bruce Springsteen"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}