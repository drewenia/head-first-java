package io.drewenia.primitivesAndReferences;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] hobbits = new Hobbits[3];
        int x = -1;
        while (x < 2) {
            x += 1;
            hobbits[x] = new Hobbits();
            hobbits[x].name = "sam";
            if (x == 1) {
                hobbits[x].name = "frodo";
            }
            if (x == 2) {
                hobbits[x].name = "bilbo";
            }
            System.out.println(hobbits[x].name + " is a good hobbit name");
        }
    }
}
