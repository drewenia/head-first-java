package io.drewenia.aQuickDip;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){
            String plural = "bottle";
            if (beerNum == 1) {
                word = plural;
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            beerNum = beerNum - 1;
            if (beerNum < 1) {
                System.out.println("no more bottles of beer on the wall");
            }
        }
    }
}
