package io.drewenia.exceptionHandling;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
        } catch (MidiUnavailableException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
