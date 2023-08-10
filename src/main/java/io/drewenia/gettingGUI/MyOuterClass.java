package io.drewenia.gettingGUI;

public class MyOuterClass {
    private int x;

    class MyInnerClass{
        void go(){
            x = 42; // inner class'ın bir variable'i gibi 'x' değişkenini kullanın!
        }
    }
}
