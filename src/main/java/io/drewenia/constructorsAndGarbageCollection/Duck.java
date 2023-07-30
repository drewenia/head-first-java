package io.drewenia.constructorsAndGarbageCollection;

public class Duck {
    int size;

    public Duck(int duckSize) {
        if (duckSize == 0){
            this.size = 27;
        } else {
            this.size = duckSize;
        }
    }
}
