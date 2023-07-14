package io.drewenia.classesAndObjects;

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;
        if (dvdPlayer.canRecord)
            dvdPlayer.recordDVD();
    }
}
