package io.drewenia.serializationAndFileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Foo.txt");
            fileWriter.write("hello foo");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
