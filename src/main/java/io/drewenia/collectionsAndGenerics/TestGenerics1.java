package io.drewenia.collectionsAndGenerics;

import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    private void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        takeAnimals(animals);
        takeAnimals(dogs); // compiler burada hata verecektir
    }

    private void takeAnimals(ArrayList<? extends Animal> animals) {
        for(Animal a : animals){
            a.eat();
        }
    }
}
