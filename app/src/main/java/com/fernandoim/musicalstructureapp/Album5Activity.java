package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("London Calling","The Clash"));
        songs.add(new Song("Brand New Cadillac","The Clash"));
        songs.add(new Song("Jimmy Jazz","The Clash"));
        songs.add(new Song("Hateful","The Clash"));
        songs.add(new Song("Rudie Can't Fail","The Clash"));
        songs.add(new Song("Spanish Bombs","The Clash"));
        songs.add(new Song("The Right Profile","The Clash"));
        songs.add(new Song("Lost in the Supermarket","The Clash"));
        songs.add(new Song("Clampdown","The Clash"));
        songs.add(new Song("The Guns of Brixton","The Clash"));
        songs.add(new Song("Wrong 'Em Boyo","The Clash"));
        songs.add(new Song("Death or Glory","The Clash"));
        songs.add(new Song("Koka Kola","The Clash"));
        songs.add(new Song("The Card Cheat","The Clash"));
        songs.add(new Song("Lover's Rock","The Clash"));
        songs.add(new Song("Four Horsemen","The Clash"));
        songs.add(new Song("I'm Not Down","The Clash"));
        songs.add(new Song("Revolution Rock","The Clash"));
        songs.add(new Song("Train in Vain","The Clash"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}