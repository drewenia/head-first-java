package io.drewenia.constructorsAndGarbageCollection;

public class TestLifeOne {
    public void read(){
        // 's' variable'i, read() methodunun kapsamındadır (yani, o metot içinde tanımlıdır), bu nedenle başka bir
        // yerde kullanılamaz.
        int s = 42;
        sleep();
    }

    public void sleep(){
        //s = 7; // read() methoduna ait local bir variable olan s'yi burada kullanamam
    }
}
