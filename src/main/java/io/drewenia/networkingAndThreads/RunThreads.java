package io.drewenia.networkingAndThreads;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        /* Runnable instance'i yarat */
        RunThreads runThreads = new RunThreads();

        /* İki thread oluşturun, aynı Runnable'ı (aynı görevi - "iki thread ve bir Runnable" konusunu birkaç sayfa
        sonra daha detaylı konuşacağız) kullanarak. */
        Thread alpha = new Thread(runThreads);
        Thread beta = new Thread(runThreads);

        /* Thread'lere isim ver */
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");

        /* Thread'leri başlat */
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            /* Her bir thread bu döngüden geçecek ve her seferinde kendi adını yazdıracaktır. */
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "is running");
        }
    }
}
