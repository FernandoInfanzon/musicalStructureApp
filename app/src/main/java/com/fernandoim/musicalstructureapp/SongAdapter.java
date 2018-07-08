package com.fernandoim.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

     public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }


      @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_song, parent, false);
        }

        // Get the word object located at this position in the list
        Song currentSong = getItem(position);

        //Find the TextView in the list_item.xml layout the ID version_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        //Get the Version Name from the current AndroidFlavor object and set this text on the v
        artistTextView.setText(currentSong.getArtist());

        //Find the TextView in the list_item.xml with the ID version_number
        TextView songTextView =  listItemView.findViewById(R.id.song_text_view);
        //Get the Version Number from the current AndroidFlavor object and set this on the
        songTextView.setText(currentSong.getSong());

        //Find the TextView in the list_item.xml with the ID version_number
//        ImageView iconView =  listItemView.findViewById(R.id.image_text_view);
//        //Get the Version Number from the current AndroidFlavor object and set this on the
//        iconView.setImageResource(currentSong.getImageResourceId());


        //Return the whole list item layout (containing 2 TextViews) so that
        return listItemView;

    }




}
