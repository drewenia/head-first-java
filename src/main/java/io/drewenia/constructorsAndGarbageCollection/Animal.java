package io.drewenia.constructorsAndGarbageCollection;

public abstract class Animal {
    private String name; // Tüm hayvanların (alt sınıflar dahil) bir "name" variable'i vardır.

    public String getName(){ // Hippo'nun miras aldığı bir getter metodu vardır.
        return name;
    }

    /* Bu, "name" alan ve onu name instance variables'a atayan constructor'dır. */
    public Animal(String name){
        this.name = name;
    }
}
