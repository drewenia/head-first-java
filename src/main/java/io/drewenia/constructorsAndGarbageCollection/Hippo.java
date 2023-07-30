package io.drewenia.constructorsAndGarbageCollection;

public class Hippo extends Animal{
    public Hippo(String name){ // Constructor "name" degerini aliyor
        // Bu constructor, "name" i Stack üzerinde yukarı doğru Animal constructor'ına gönderir.
        super(name);
    }
}
