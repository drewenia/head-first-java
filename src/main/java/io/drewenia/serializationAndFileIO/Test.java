package io.drewenia.serializationAndFileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.setWidth(37);
        foo.setHeight(70);
        try {
            /* Eğer dosya yok ise otomatik create edilir. Bir FileOutputStream nesnesi oluşturun. FileOutputStream,
            bir dosyaya bağlanmayı (ve oluşturmayı) bilir.*/
            FileOutputStream fileStream = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(foo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
