package io.drewenia.networkingAndThreads;

public class RyanAndMonicaJob implements Runnable {
    /* Sadece BIR tane RyanAndMonicaJob instance'i olacak. Bu, sadece BİR tane banka hesabı instance'inin olacağı
    anlamına gelir. Her iki thread de bu tek hesaba erişecek.*/
    private final BankAccount bankAccount = new BankAccount();

    public static void main(String[] args) {

        // Instantiate runnable
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        /* İki thread oluşturun ve her thread'e aynı Runnable işini verin. Bu, her thread'in Runnable sınıfındaki tek
        hesap instance variable'ina erişeceği anlamına gelir.*/
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();
    }

    @Override
    public void run() {
        /* run() methodunda, bir thread döngü içinden geçer ve her tekrarda para çekme işlemi yapmaya çalışır.
        Çekme işleminden sonra hesabın bakiyesini tekrar kontrol eder ve hesabın overdrawn(asılı) durumda olup
        olmadığını kontrol eder.*/
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (bankAccount.getBalance() < 0){
                System.out.println("Overdrawn");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        /* Hesap bakiyesini kontrol ederiz ve yeterli para yoksa sadece bir mesajı yazdırırız. Eğer yeterli para varsa,
        uyuruz, sonra uyanır ve Ryan'ın yaptığı gibi çekme işlemini tamamlarız. */
        if (bankAccount.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            bankAccount.withDraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        }
        else{
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}
