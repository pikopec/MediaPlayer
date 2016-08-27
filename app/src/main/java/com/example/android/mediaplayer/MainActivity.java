package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Add a MediaPlayer instance to manage an audio file in
         * the app.
         */
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

    }

    public void playSong(View v ){
        mediaPlayer.start();
    }

    public void pauseSong(View v ){
        mediaPlayer.pause();
    }

    public void resetSong(View v ){
        mediaPlayer.stop();
    }
}
