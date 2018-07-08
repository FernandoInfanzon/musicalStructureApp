package com.fernandoim.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Sgt. Pepper's Lonely Hearts Club Band","The Beatles."));
        songs.add(new Song("With a Little Help from My Friends","The Beatles."));
        songs.add(new Song("Lucy in the Sky with Diamonds","The Beatles."));
        songs.add(new Song("Getting Better","The Beatles."));
        songs.add(new Song("Fixing a Hole","The Beatles."));
        songs.add(new Song("She's Leaving Home","The Beatles."));
        songs.add(new Song("Being for the Benefit of Mr. Kite!","The Beatles."));
        songs.add(new Song("Within You Without You","The Beatles."));
        songs.add(new Song("When I'm Sixty-Four","The Beatles."));
        songs.add(new Song("Lovely Rita","The Beatles."));
        songs.add(new Song("Good Morning Good Morning","The Beatles."));
        songs.add(new Song("Sgt. Pepper's Lonely Hearts Club Band (Reprise)","The Beatles."));
        songs.add(new Song("A Day in the Life","The Beatles."));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
