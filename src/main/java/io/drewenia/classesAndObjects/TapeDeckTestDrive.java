package io.drewenia.classesAndObjects;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck tapeDeck = new TapeDeck();
        tapeDeck.canRecord = true;
        tapeDeck.playTape();
        if (tapeDeck.canRecord){
            tapeDeck.recordTape();
        }
    }
}
