package io.drewenia.gettingGUI;

import javax.sound.midi.*;

/* ControllerEvents'ı dinlememiz gerekiyor, bu nedenle listener interface'ini implemente ederiz */
public class MiniMusicPlayer2 implements ControllerEventListener {

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            /* Sequencer ile eventlere register olun. Event registration methodu, listener VE bir int array'i alır;
            bu int array'i, istediğiniz ControllerEvent listesini temsil eder. Sadece bir evente, #127 eventine
            ihtiyacımız var.*/
            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 60; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));

                /* İşte nasıl ritmi yakaladığımız -- kendi ControllerEvent'ımızı (#176, event type'inin ControllerEvent
                olduğunu belirtir) #127 event numarası için bir argümanla ekliyoruz. Bu olay HİÇBİR ŞEY yapmayacak!
                Sadece her bir nota çalındığında bir event alabilmek için ekliyoruz. Başka bir deyişle, yalnızca amacı,
                BİZİM dinleyebileceğimiz bir şeyi tetiklemektir (NOTE ON/OFF event'lerini dinleyemeyiz). Bu event'in,
                NOTE ON ile AYNI vuruşta meydana gelmesini sağlıyoruz. Yani NOTE ON event'i gerçekleştiğinde,
                BİZİM event'imiz aynı anda tetikleneceğinden haberimiz olacak.*/
                track.add(makeEvent(176, 1, 127, 0, i));

                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void controlChange(ShortMessage event) {
        /* Event handler methodu (ControllerEvent listener interface'inden). Her seferinde event'i aldığımızda,
        komut satırına "la" yazdıracağız.*/
        System.out.println("la");
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return event;
    }
}
