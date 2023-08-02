package io.drewenia.numbersAndStatics;

public class Song {
    String title;

    public Song(String title){
        this.title = title;
    }

    public void play(){
        SoundPlayer soundPlayer = new SoundPlayer();
        // "Title" instance variable'inin mevcut değeri, play() methodu çağrıldığında çalan şarkıdır.
        soundPlayer.playSound(title);
    }
}
