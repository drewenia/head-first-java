package io.drewenia.classesAndObjects;

public class Player {
    int number = 0; // tahmin nereye gidiyor

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
