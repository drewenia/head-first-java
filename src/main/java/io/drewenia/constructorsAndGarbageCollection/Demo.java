package io.drewenia.constructorsAndGarbageCollection;

public class Demo {
    public void doStuff(){
        boolean b = true;
        go(4);
    }

    public void go(int x){
        int z = x + 24;
        crazy();
    }

    public void crazy(){
        char c = 'a';
    }
}
