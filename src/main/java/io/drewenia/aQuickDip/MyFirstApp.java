package io.drewenia.aQuickDip;

public class MyFirstApp {
    public static void main(String[] args) {
        int x = 4; //x'e 4 degerini ata

        while (x > 3) {
            // döngüdeki kod, döngüde belirtilen koşulun doğru olması nedeniyle çalışacaktır
            // x 3'ten büyüktür
            x = x - 1;
        }

        int z = 27;
        while(z == 17){
            // loop code'u calismaz cunku z degiskeni 17'ye esit degildir
            System.out.println(z);
        }
    }
}
