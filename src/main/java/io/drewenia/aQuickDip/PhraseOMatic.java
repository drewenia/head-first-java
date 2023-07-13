package io.drewenia.aQuickDip;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi Tier", "30,000 foot", "B-to-B", "win-win", "frond-end", "web-based"};
        String[] wordListTwo = {"oriented", "outside-the-box", "centric", "leveraged", "aligned", "accelerated"};
        String[] wordListThree = {"process", "solution", "appendix", "mission", "oop", "java", "python", "c#", "ide"};

        // her bir listede kac eleman var?
        int listOne = wordListOne.length;
        int listTwo = wordListTwo.length;
        int listThree = wordListThree.length;

        // 3 adet random number generate et
        int rand1 = (int) (Math.random() * listOne);
        int rand2 = (int) (Math.random() * listTwo);
        int rand3 = (int) (Math.random() * listThree);

        // phrase'i build et
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // phrase'i yazdır
        System.out.println("What we need is a " + phrase);
    }
}
