package io.drewenia.numbersAndStatics;

public class PlayerTestDrive {
    public static void main(String[] args) {
        //playerCount burada 0 olarak gelir cunku Player nesnesinin instance'i create edilmedi.
        // Constructor call yapilmadi
        System.out.println(Player.playerCount);
        Player player = new Player("Tiger");
        /* Player'a ait instance create edildi ve playerCount constructor içerisinde 1 artırıldı */
        System.out.println(Player.playerCount);
    }
}
