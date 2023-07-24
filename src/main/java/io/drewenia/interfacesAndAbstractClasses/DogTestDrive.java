package io.drewenia.interfacesAndAbstractClasses;

public class DogTestDrive {
    public static void main(String[] args) {

    }

    void go(){
        Dog dog = new Dog();
        Object sameDog = getObject(dog);
    }

    Object getObject(Object o){
        return o;
    }
}
