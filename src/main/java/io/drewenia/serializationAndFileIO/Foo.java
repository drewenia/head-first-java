package io.drewenia.serializationAndFileIO;

import java.io.Serializable;

public class Foo implements Serializable {
   private int width;
   private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
