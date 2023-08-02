package io.drewenia.numbersAndStatics;

public class Player {
    /* playerCount, sınıf yüklendiğinde başlatılır. Onu açıkça 0 olarak başlattık, ancak int veri türleri için 0,
    varsayılan değerdir. Statik değişkenler, instance variable'ları gibi varsayılan değerleri alır.*/
    static int playerCount = 0;
    private String name;
    public Player(String name){
        this.name = name;
        playerCount++;
    }
}
