package com.skrefi.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        final List<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.s1name),getString(R.string.s1artist)));
        songs.add(new Song(getString(R.string.s2name),getString(R.string.s2artist)));
        songs.add(new Song(getString(R.string.s3name),getString(R.string.s3artist)));
        songs.add(new Song(getString(R.string.s4name),getString(R.string.s4artist)));

        SongAdapter songAdapter = new SongAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentItem = songs.get(position);
                Intent intent = new Intent(Library.this,music_player.class);
                intent.putExtra("nameSong",currentItem.getSongName());
                intent.putExtra("artistName",currentItem.getSongArtist());

                startActivity(intent);
            }
        });
    }
}
