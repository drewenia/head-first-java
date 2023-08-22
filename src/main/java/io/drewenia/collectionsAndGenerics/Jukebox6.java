package io.drewenia.collectionsAndGenerics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList + "\n");
        Collections.sort(songList);
        System.out.println(songList + "\n");
        HashSet<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);
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
