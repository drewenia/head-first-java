package io.drewenia.writingAProgram;

public class SimpleDotComGame {
    public static void main(String[] args) {
        // DECLARE -  Kullanıcının tahmin sayısını tutmak için numOfGuesses adında bir tamsayı değişkeni
        int numOfGuess = 0;

        // Bu, kullanıcı inputu almak için bir method içeren özel bir sınıftır. Şimdilik, onu Java'nın bir parçasıymış
        // gibi düşünün.
        GameHelper gameHelper = new GameHelper();

        // MAKE - SimpleDotCom sınıfına ait instance
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        //COMPUTE - Başlangıç konumunun hücre pozisyonunu temsil etmek için 0 ile 4 arasında rastgele bir sayıya
        //ihtiyacımız var
        int random = (int) (Math.random() * 5);

        // MAKE - Rastgele oluşturulan sayıyı, sayının bir fazlasını ve sayının iki fazlasını içeren 3 tamsayıdan oluşan
        // int array oluştur
        int[] locations = {random, random + 1, random + 2};

        // INVOKE - SimpleDotCom nesnesi üzerinde ki setLocalionCells invoke et
        simpleDotCom.setLocationCells(locations);

        // DECLARE - Oyunun durumunu temsil eden, isAlive adında bir boolean değişken. Onu true olarak set et
        boolean isAlive = true;

        // WHILE - dotcom stillAlive ise (isAlive==true)
        while (isAlive){
            // GET - Command line üzerinden user input'u al
            String guess = gameHelper.getUserInput("enter a number");
            //  INVOKE - SimpleDotCom instance'i uzerinden checkYourSelf() methodunu kullan
            String result = simpleDotCom.checkYourSelf(guess);
            // INCREMENT - numOfGuesses variable'ini artır
            numOfGuess++;

            // IF - result "kill" ise
            if (result.equals("kill")){
                // SET - isAlive to false
                isAlive = false;
                // PRINT - user'in guess'lerinin kac adede çıktığını print et
                System.out.println("you took " + numOfGuess + " guesses");
            }
        }
    }
}
