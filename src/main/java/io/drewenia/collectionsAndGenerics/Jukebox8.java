package io.drewenia.collectionsAndGenerics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Jukebox8 {
    ArrayList<Song> songList = new ArrayList<>();
    int value;

    public static void main(String[] args) {
        new Jukebox8().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<>(songList);
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
