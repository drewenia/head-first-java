package io.drewenia.serializationAndFileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("box.ser");
            ObjectInputStream os = new ObjectInputStream(fis);

            Object one = os.readObject();

            Box box = (Box) one;
            System.out.println(box.getHeight());
            System.out.println(box.getWidth());

            os.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
