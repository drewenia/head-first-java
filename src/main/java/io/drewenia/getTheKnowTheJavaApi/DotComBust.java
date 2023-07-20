package io.drewenia.getTheKnowTheJavaApi;

import java.util.ArrayList;

public class DotComBust {
    // Declare and initialize the variables we'll need
    private int numberOfGuess = 0;
    private final ArrayList<DotCom> dotComsList = new ArrayList<>();
    private final GameHelper helper = new GameHelper();

    private void setUpGame() {
        // 3 tane DotCom Object'i create edilip name'leri set ediliyor
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        // ArrayList'e 3 adet DotCom nesnesi yerleştiriliyor
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // ArrayList içerisinde ki 3 adet DotCom nesnesi repeat ediliyor
        for (DotCom dotCom : dotComsList) {
            // Helper methodundan DotCom konumu isteyin
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // Helper nesnesinden gelen location'lari DotCom'un setLocationCells ArrayList'ine gönderin
            dotCom.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        // dotComsList boş olmadığı sürece
        while (!dotComsList.isEmpty()) {
            // User'dan tahmin alin
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String guess) {
        numberOfGuess++; // kullanicinin yaptigi tahmin sayisini artir

        String result = "miss"; // Aksi söylenmedikçe ıskaladığını varsayalım

        // dotComsList içerisinde ki tüm DotComs'lar için tekrar et
        for (int x = 0; x < dotComsList.size(); x++) {
            // kullanicinin tahminini Dotcom üzerinde ki checkYourSelf methodu ile test et
            result = dotComsList.get(x).checkYourSelf(guess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numberOfGuess <= 18) {
            System.out.println("It only took you " + numberOfGuess + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numberOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        DotComBust dotComBust = new DotComBust();
        dotComBust.setUpGame();
        dotComBust.startPlaying();
    }
}
