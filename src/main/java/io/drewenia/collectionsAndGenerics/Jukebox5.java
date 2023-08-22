package io.drewenia.collectionsAndGenerics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song>{
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList,artistCompare);
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                addSong(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}
