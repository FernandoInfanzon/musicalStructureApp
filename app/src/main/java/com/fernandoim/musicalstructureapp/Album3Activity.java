package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Sunday Morning","Andy Warhol"));
        songs.add(new Song("I'm Waiting for the Man","Andy Warhol"));
        songs.add(new Song("Femme Fatale","Andy Warhol"));
        songs.add(new Song("Venus in Furs","Andy Warhol"));
        songs.add(new Song("Run Run Run","Andy Warhol"));
        songs.add(new Song("All Tomorrow's Parties","Andy Warhol"));
        songs.add(new Song("Heroin","Andy Warhol"));
        songs.add(new Song("There She Goes Again","Andy Warhol"));
        songs.add(new Song("I'll Be Your Mirror","Andy Warhol"));
        songs.add(new Song("The Black Angel's Death Song","Andy Warhol"));
        songs.add(new Song("European Son","Andy Warhol"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}