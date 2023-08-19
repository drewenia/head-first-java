package io.drewenia.networkingAndThreads;

public class ThreadTester {
    public static void main(String[] args) {
        /* Yeni Runnable instance'ini yeni Thread constructor'ına iletin. Bu, thread'e yeni stack'in en altına hangi
        methodu koyacağını söyler. Başka bir deyişle, yeni thread'in çalıştıracağı ilk method .*/
        Runnable threadJob = new MyRunnable();
        Thread thread = new Thread(threadJob);

        /* Thread instance'i üzerinde start() methodunu çağırmadığınız sürece yeni bir thread of execution
        almayacaksınız. Bir Thread onu başlatmadığınız sürece gerçekten bir Thread değildir. Bu zamana kadar, herhangi
        bir diğer nesne gibi sadece bir Thread instance'idir, ancak gerçek bir 'thread özelliği' olmayacaktır.*/
        thread.start();
        System.out.println("back in main");
    }
}
