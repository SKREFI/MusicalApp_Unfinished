package com.skrefi.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.skrefi.musicalapp.Constants.KEY_SONG_NAME;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        TextView songTextView = findViewById(R.id.song);
        TextView artistTextView = findViewById(R.id.artist);

        final Bundle extras = getIntent().getExtras();

        songTextView.setText(extras.getString(KEY_SONG_NAME));
        artistTextView.setText(extras.getString(KEY_SONG_NAME));

        ImageView stopView = findViewById(R.id.stop_button);
        ImageView playView = findViewById(R.id.play_button);
        ImageView pauseView = findViewById(R.id.pause_button);
        stopView.setOnClickListener((View.OnClickListener) this);
        playView.setOnClickListener((View.OnClickListener) this);
        pauseView.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.stop_button:
                Toast.makeText(MusicPlayer.this,"Stop button",Toast.LENGTH_LONG).show();
                break;
            case R.id.play_button:
                Toast.makeText(MusicPlayer.this,"Play button",Toast.LENGTH_LONG).show();
                break;
            case R.id.pause_button:
                Toast.makeText(MusicPlayer.this,"Pause button",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
