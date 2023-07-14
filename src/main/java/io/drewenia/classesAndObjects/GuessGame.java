package io.drewenia.classesAndObjects;

public class GuessGame {
    // instance variables
    Player player1;
    Player player2;
    Player player3;

    public void startGame() {
        // 3 player object'i yukarıda ki instance variable'a assing edilir
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        // oyuncularin yaptiklari 3 tahmini tutmak icin 3 degisken
        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        // 3 degisken oyuncunun cevabinin dogru olup olmadigini tutmak icin
        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // player class'i icerisinde ki guess methodunu 3 player icinde calistir
            player1.guess();
            player2.guess();
            player3.guess();

            // her oyuncunun tahminini burada ki int degiskenlere ata
            guessPlayer1 = player1.number;
            System.out.println("Player 1 guessed " + guessPlayer1);

            guessPlayer2 = player2.number;
            System.out.println("Player 2 guessed " + guessPlayer2);

            guessPlayer3 = player3.number;
            System.out.println("Player 3 guessed " + guessPlayer3);

            // her bir oyuncu icin tahmini ve targetNumber tutuyorsa kontrolu yap
            if (guessPlayer1 == targetNumber){
                player1IsRight = true;
            }

            if (guessPlayer2 == targetNumber){
                player2IsRight = true;
            }

            if (guessPlayer3 == targetNumber){
                player3IsRight = true;
            }

            // eger player'ların herhangi birinin tahmini dogru ise bu bloga gir (OR Operator)
            if (player1IsRight || player2IsRight || player3IsRight){
                System.out.println("We have a winner");
                System.out.println("Player 1 got it right " + player1IsRight);
                System.out.println("Player 2 got it right " + player2IsRight);
                System.out.println("Player 3 got it right " + player3IsRight);
                System.out.println("Game is over");
                break;
            } else {
                // tahminler dogru degilse devam et
                System.out.println("Players will have to try again");
            }
        }
    }
}
