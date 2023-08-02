package io.drewenia.numbersAndStatics;

public class Duck {
    // statik duckCount variable'i sadece sınıf ilk yüklendiğinde başlatılır, her yeni instance oluşturulduğunda değil.
    private static int duckCount = 0;

    public Duck() {
        // Şimdi Duck constructor'ı çalıştığı her seferinde artmaya devam edecek, çünkü duckCount statik bir değişken
        // ve 0'a sıfırlanmayacak.
        duckCount++;
    }
}
