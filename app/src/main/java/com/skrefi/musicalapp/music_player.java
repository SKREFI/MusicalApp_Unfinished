package com.skrefi.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class music_player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        TextView songTextView = findViewById(R.id.song);
        TextView artistTextView = findViewById(R.id.artist);

        final Bundle extras = getIntent().getExtras();

        songTextView.setText(extras.getString("songName"));
        artistTextView.setText("artistName");
    }
}
