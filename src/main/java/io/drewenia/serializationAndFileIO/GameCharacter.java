package io.drewenia.serializationAndFileIO;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapon() {
        StringBuilder weapon = new StringBuilder();
        for (String s : weapons) {
            weapon.append(s).append(" ");
        }

        return weapon.toString();
    }
}
