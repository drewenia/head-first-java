package io.drewenia.serializationAndFileIO;

import java.io.Serial;
import java.io.Serializable;

public class DungeonGame implements Serializable {
    @Serial
    private static final long serialVersionUID = -2401133103147952792L;

    public int x = 3;
    transient long y = 4;
    private short z = 5;

    public int getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public short getZ() {
        return z;
    }
}
