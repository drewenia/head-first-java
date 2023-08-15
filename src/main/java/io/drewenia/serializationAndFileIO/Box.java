package io.drewenia.serializationAndFileIO;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setWidth(50);
        box.setHeight(30);

        try {
            FileOutputStream fos = new FileOutputStream("box.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(box);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
