package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Come Together","The Beatles."));
        songs.add(new Song("Something","The Beatles."));
        songs.add(new Song("Maxwell's Silver Hammer","The Beatles."));
        songs.add(new Song("Oh! Darling","The Beatles."));
        songs.add(new Song("Octopus's Garden","The Beatles."));
        songs.add(new Song("I Want You (She's So Heavy)","The Beatles."));
        songs.add(new Song("Here Comes the Sun","The Beatles."));
        songs.add(new Song("Because","The Beatles."));
        songs.add(new Song("You Never Give Me Your Money","The Beatles."));
        songs.add(new Song("Sun King","The Beatles."));
        songs.add(new Song("Mean Mr. Mustard","The Beatles."));
        songs.add(new Song("Polythene Pam","The Beatles."));
        songs.add(new Song("She Came In Through the Bathroom Window","The Beatles."));
        songs.add(new Song("Golden Slumbers","The Beatles."));
        songs.add(new Song("Carry That Weight","The Beatles."));
        songs.add(new Song("The End","The Beatles."));
        songs.add(new Song("Her Majesty","The Beatles."));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}