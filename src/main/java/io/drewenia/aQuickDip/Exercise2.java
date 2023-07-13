package io.drewenia.aQuickDip;

public class Exercise2 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            System.out.println(x);
            if (x > 3)
                System.out.println("big x");
            x = x + 1;
        }
    }
}
