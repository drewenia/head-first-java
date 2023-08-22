package io.drewenia.collectionsAndGenerics;

/* Genellikle bunlar eşleşir... implemente eden sınıfın karşılaştırılabileceği türü belirtiyoruz. Bu, Song nesnelerinin
sıralama amacıyla diğer Song nesneleriyle karşılaştırılabileceği anlamına gelir.*/
public class Song implements Comparable<Song> {
    private final String title;
    private final String artist;
    private final String rating;
    private final String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    /* toString() methodunu override etme nedenimiz, bir System.out.println(aSongObject) işlemi yaptığınızda başlığı
    görmek istememizdir. Bir System.out.println(aSongList) işlemi yaptığınızda ise liste içindeki HER öğenin toString()
    methodunu çağırır.*/

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    /* sort() methodu, compareTo()'ya bir Song gönderir ve bu Song'un, methodun çağrıldığı Song ile nasıl
    karşılaştırıldığını görür.*/
    public int compareTo(Song s) {
        /* Basit! Sadece işi title String nesnelerine devrederiz, çünkü String'lerin bir compareTo() methodu olduğunu
        biliyoruz.*/
        return title.compareTo(s.title);
    }

    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }
}
