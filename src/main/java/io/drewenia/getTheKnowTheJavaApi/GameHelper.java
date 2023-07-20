package io.drewenia.getTheKnowTheJavaApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    // Grid'in yatay eksende ki adedi 7 olduğu için 7 adet alphabet character tanımlıyoruz
    private static final String alphabet = "abcdefg";
    private final int gridLength = 7;
    private final int gridSize = 49;
    private final int[] grid = new int[gridSize];
    private int dotComCount = 0;

    // DotComBurst sınıfı tarafından çağırılır
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = reader.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine.toLowerCase();
    }

    // DotComBust sınıfı tarafından kullanılmaktadır
    public ArrayList<String> placeDotCom(int dotComSize) {
        ArrayList<String> alphaCells = new ArrayList<>();

        String temp = null; //Temp olarak String'i concat edecek olan değişken
        int[] coords = new int[dotComSize]; // güncel aday koordinatları. 3 odalı bir array create ediliyor

        // güncel girişim sayacı. Aşağıda 200 defa denenecek ki aynı rakamları array'e atma ihtimali olmasın
        int attemps = 0;
        boolean success = false; // flag = iyi bir yer buldun mu?
        int location = 0; // güncel başlama noktası. Array'in sıfırıncı elemanı

        // dotComCount 0 ile başlatıldığı için 1 artırıyorum
        dotComCount++;
        int incr = 1;
        // dotComCount odd(tek) bir değerse incr değişkeninin gridLength'in değeri olan 7 ye ayarlıyorum
        if ((dotComCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success && attemps++ < 200) {
            // random bir location belirtiyorum. 0 ile gridSize 49 olduğu için 49 arasında
            location = (int) (Math.random() * gridSize);
            int x = 0;
            // evet bir location belirledim ve success flag'ini true hale getirdim
            success = true;
            // success flag'i true AND dotComsize(3) x'den büyük olduğu sürece
            while (success && x < dotComSize) {
                // location değeri random üretildi ve 8 geldi burada diyoruz ki grid array'inin 36. index'ine git
                // eğer değer 0'a eşitse bu hücre boş demektir
                if (grid[location] == 0) {
                    // x 0 olduğu için coords array'inin ilk hücresine 36 değeri yerleşti ve x++ operatörü ile x 1 oldu
                    // yani coords array'inin 1. index'ine gittik
                    coords[x++] = location;
                    // location değerini incr değeri kadar ilerlet yani 7 değerinde
                    location += incr;
                }
                // 49'luk bir size'imiz olduğu için sığmayan random bir değer üretilirse while dongusu attempt'i
                // artırıp devam edecek
                if (location>= gridSize){
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;

        while (x<dotComSize){
            // grid 49 elemandan oluşmaktadır. [coords[x]] coords arrayinin içerisinde ki 0. elemani işaret etmektedir
            // o da 19'dur. Dolayısıyla grid[19] = 1 diyoruz
            grid[coords[x]] = 1;
            // row ve column'a gore DotCom'lar yerleştirilip alphaCells ArrayList'ine alphabecit characterlerle
            // yerleştiriliyor
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
