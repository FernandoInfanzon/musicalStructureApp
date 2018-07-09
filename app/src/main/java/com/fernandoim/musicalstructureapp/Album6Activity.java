package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Brown Sugar","The Rolling Stones"));
        songs.add(new Song("Sway","The Rolling Stones"));
        songs.add(new Song("Wild Horses","The Rolling Stones"));
        songs.add(new Song("Can't You Hear Me Knocking","The Rolling Stones"));
        songs.add(new Song("You Gotta Move","The Rolling Stones"));
        songs.add(new Song("Bitch","The Rolling Stones"));
        songs.add(new Song("I Got the Blues","The Rolling Stones"));
        songs.add(new Song("Sister Morphine","The Rolling Stones"));
        songs.add(new Song("Dead Flowers","The Rolling Stones"));
        songs.add(new Song("Moonlight Mile","The Rolling Stones"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}