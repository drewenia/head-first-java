package io.drewenia.serializationAndFileIO;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bare hands", "big axe"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"});

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            objectOutputStream.writeObject(one);
            objectOutputStream.writeObject(two);
            objectOutputStream.writeObject(three);

            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // artik  heap'ten object'lere erişemeyeceğim
        one = null;
        two = null;
        three = null;

        try {
            /* Serialize ettiğim nesneyi deserialize ediyorum */
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter twoRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter threeRestore = (GameCharacter) objectInputStream.readObject();

            System.out.println("One's type : " + oneRestore.getType());
            System.out.println("Two's type : " + twoRestore.getType());
            System.out.println("Three's type : " + threeRestore.getType());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
