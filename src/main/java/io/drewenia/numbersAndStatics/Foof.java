package io.drewenia.numbersAndStatics;

public class Foof {
    final int size = 3; // size variable'ini değiştiremezsiniz
    final int whuffie;

    public Foof(){
        whuffie = 42; // whuffie variable'ini değiştiremezsiniz
    }

    void doStuff(final int x){
        // gelen x değerini değiştiremezsiniz
    }

    void doMore(){
        final int z = 7; // z variable'ini değiştiremezsiniz
    }
}
