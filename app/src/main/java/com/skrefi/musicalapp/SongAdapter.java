package com.skrefi.musicalapp;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
public class SongAdapter extends ArrayAdapter<Song>{
    public SongAdapter(Context context,List<Song> songs){
        super(context,0, songs);
    }
    // This is an inner Class (A Class inside your SongAdapter Class)
    // and it will be used to improve the performance of the App
    public static class ViewHolder
    {
        TextView songName;
        TextView artistName;
        ViewHolder(View v)
        {
            songName = v.findViewById(R.id.song_name);
            artistName = v.findViewById(R.id.song_artist);
        }
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.library_list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Song song = getItem(position);
        if (song != null) {
            viewHolder.songName.setText(song.getSongName());
            viewHolder.artistName.setText(song.getSongArtist());
        }
        return convertView;
    }
}