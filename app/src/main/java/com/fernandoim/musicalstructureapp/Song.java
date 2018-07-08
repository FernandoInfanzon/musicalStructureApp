package com.fernandoim.musicalstructureapp;

import android.media.Image;

public class Song {

    private String mArtist;
    private String mSong;
//    private int mImageResourceId;

//, int imageResourceId

    public Song(String artist, String song) {
        mArtist = artist;
        mSong = song;
//        mImageResourceId = imageResourceId;
    }


    public String getArtist() {return mArtist;}

    public String getSong() { return mSong;}

//    public int getImageResourceId() {
//        return mImageResourceId;
//    }

}
