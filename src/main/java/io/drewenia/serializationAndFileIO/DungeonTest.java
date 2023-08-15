package io.drewenia.serializationAndFileIO;

import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame dungeonGame = new DungeonGame();
        System.out.println("dungeon x : " + dungeonGame.getX());
        System.out.println("dungeon y : " + dungeonGame.getY());
        System.out.println("dungeon z : " + dungeonGame.getZ());
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Dungeon.ser"));
            os.writeObject(dungeonGame);
            os.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Dungeon.ser"));
            dungeonGame = (DungeonGame) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After Deserialize");
        System.out.println("dungeon x : " + dungeonGame.getX());
        System.out.println("dungeon y : " + dungeonGame.getY());
        System.out.println("dungeon z : " + dungeonGame.getZ());
    }
}
