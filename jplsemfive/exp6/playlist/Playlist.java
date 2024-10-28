package jplsemfive.exp6.playlist;

import java.util.*;

class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(int index, Song song) {
        if ((index-1) >= 0 && (index-1) <= songs.size()) {
            songs.add(index-1, song);
        } else {
            System.out.println("Invalid index for adding song.");
        }
    }

    public void removeSong(int index) {
        if ((index-1) >= 0 && (index-1) < songs.size()) {
            System.out.println("Removing the song " + songs.get(index-1).getTitle());
            songs.remove(index-1);
        } else {
            System.out.println("Invalid index for removing song.");
        }
    }
    
    public void addNext(Song song) {
        songs.add(song);
    }

    public void printSongs() {
        for (int index = 0; index < songs.size(); index++) {
            Song song = songs.get(index);
            System.out.println((index+1) + ": " + song.getTitle() + " of genre " + song.getGenre());
        }
    }
}
