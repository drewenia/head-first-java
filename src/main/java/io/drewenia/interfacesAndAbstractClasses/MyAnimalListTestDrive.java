package io.drewenia.interfacesAndAbstractClasses;

public class MyAnimalListTestDrive {
    public static void main(String[] args) {
        MyAnimalList animalList = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animalList.add(dog);
        animalList.add(cat);
    }
}
