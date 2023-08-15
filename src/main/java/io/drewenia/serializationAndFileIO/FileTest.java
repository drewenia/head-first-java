package io.drewenia.serializationAndFileIO;

import java.io.*;

public class FileTest {
    private static final long serialVersionUID = 7803272182415534792L;
    public static void main(String[] args) {
        File myFile = new File("Foo.txt");
        try {
            // Bir FileReader, karakterler için bir connection stream'dir ve bir metin dosyasına bağlanır.
            FileReader fileReader = new FileReader(myFile);

            // Daha verimli okuma için FileReader'ı BufferedReader'e chain edin. Bu şekilde, program buffer'i
            // boşalttığında (çünkü tüm içerik okunmuştur) file'a geri döner ve yeniden okuma yapar.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            // Bu şu anlama gelir: "Bir satır metin oku ve onu 'line' adlı String değişkenine ata. Bu değişken null
            // olmadığı sürece (çünkü okunacak bir şey vardır) okunan satırı yazdır."
            // Veya başka bir deyişle, "Hala okunacak satırlar varken, onları oku ve yazdır."
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
