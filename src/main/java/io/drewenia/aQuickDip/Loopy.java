package io.drewenia.aQuickDip;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop x value : " + x);

        while (x < 10) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
    }
}
