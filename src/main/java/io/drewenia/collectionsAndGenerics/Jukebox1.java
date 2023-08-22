package io.drewenia.collectionsAndGenerics;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
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
        /* addSong methodu, hem başlığı hem de sanatçıyı içeren satırı split() methodunu kullanarak iki parçaya (token)
        ayırırsınız.*/
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}
