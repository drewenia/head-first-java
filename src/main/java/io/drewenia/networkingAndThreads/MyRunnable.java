package io.drewenia.networkingAndThreads;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            /* Burada sleep çağrısı yapmak, yeni thread'i currently-running state'den ayrılmaya zorlayacaktır!*/
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /* Main thread tekrar currently-running thread haline gelecek ve "back in main" yazısını yazdıracaktır.
        Ardından, bu satıra ulaşmadan önce yaklaşık iki saniye süreyle bekleyeceğiz, doMore() fonksiyonunu çağıracak
        ve "top o' the stack" yazısını yazdıracağız.*/
        doMore();
    }

    public void doMore() {
        System.out.println("top o’ the stack");
    }
}
