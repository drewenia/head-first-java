package io.drewenia.interfacesAndAbstractClasses;

public class MyDogList {
    Dog[] myDogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog dog) {
        if (nextIndex < myDogs.length) {
            myDogs[nextIndex] = dog;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }
}
