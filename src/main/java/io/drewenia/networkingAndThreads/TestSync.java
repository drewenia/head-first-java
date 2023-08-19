package io.drewenia.networkingAndThreads;

public class TestSync implements Runnable{
    private int balance;
    @Override
    public void run() {
        /* Her bir thread 50 kez çalışır ve her döngüde bakiyeyi artırır. */
        for (int i=0;i<50;i++){
            increment();
            System.out.println("balance is : " + balance);
            System.out.println(Thread.currentThread().getName());
        }
    }

    private synchronized void increment() {
        /* İşte önemli nokta! Bakiyeyi artırırken, bakiyenin OKUNDUĞU ANDAKİ DEĞERE 1 ekleriz (şu anki değere 1 eklemek
        yerine).*/
        int i = balance;
        balance = i + 1;
    }
}
