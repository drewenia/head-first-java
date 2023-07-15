package io.drewenia.methodsUseInstanceVariables;

public class GoodDog {
    // Make the instance variable private
    private int size;

    // Getter - Setter methods
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("woof woof");
        } else if (size > 14) {
            System.out.println("ruuf ruuf");
        } else {
            System.out.println("yip, yip");
        }
    }
}
