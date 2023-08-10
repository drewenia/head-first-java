package io.drewenia.gettingGUI;

public class MyOuter {
    /* Outer class x isminde bir instance variable'a sahiptir */
    private int x;
    /* Inner class'a ait instance'i yarat */
    MyInner inner = new MyInner();
    public void doStuff(){
        /* Inner class içerisinde ki kodu call et*/
        inner.go();
    }

    class MyInner{
        void go(){
            /* Inner Class'taki method, outer class'ın instance variable'i olan 'x'i, adeta 'x' inner class'a aitmiş
            gibi kullanır.*/
            x = 42;
        }
    }
}
