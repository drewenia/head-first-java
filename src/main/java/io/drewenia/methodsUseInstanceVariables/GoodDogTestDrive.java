package io.drewenia.methodsUseInstanceVariables;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog goodDog1 = new GoodDog();
        goodDog1.setSize(70);

        GoodDog goodDog2 = new GoodDog();
        goodDog2.setSize(8);

        System.out.println("Gooddog1 size : " + goodDog1.getSize());
        System.out.println("Gooddog2 size : " + goodDog2.getSize());

        goodDog1.bark();
        goodDog2.bark();
    }
}
