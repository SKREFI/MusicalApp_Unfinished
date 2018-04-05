package com.skrefi.musicalapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

        Song currentSong = getItem(position);

        TextView nameSongView = (TextView) listItemView.findViewById(R.id.song);


        return convertView;
    }
}
