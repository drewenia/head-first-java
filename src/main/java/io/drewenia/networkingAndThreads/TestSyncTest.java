package io.drewenia.networkingAndThreads;

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();

        Thread one = new Thread(job);
        Thread two = new Thread(job);

        one.setName("Thread one");
        two.setName("Thread two");

        one.start();
        two.start();
    }
}
