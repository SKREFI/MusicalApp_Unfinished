package com.skrefi.musicalapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song>{
    public SongAdapter(Context context,ArrayList<Song> songs){
        super(context,0,songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_library,parent,false);
        }

        Song song = getItem(position);

        TextView songName = listItemView.findViewById(R.id.song_name);
        TextView artistName = listItemView.findViewById(R.id.song_artist);

        songName.setText(song.getSongName());
        artistName.setText(song.getSongArtist());


        return convertView;
    }
}
