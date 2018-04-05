package com.skrefi.musicalapp;

public class Song {
    private String mSongName;
    private String mSongArtist;

    public Song(String SongName,String SongArtist){
        mSongArtist=SongArtist;
        mSongName=SongName;
    }

    public String getSongName(){
        return mSongName;
    }

    public String getSongArtist(){
        return mSongArtist;
    }

}
