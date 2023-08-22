package io.drewenia.collectionsAndGenerics;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        /* String KEY, Integer VALUE*/
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        /* get methodu KEY alır VALUE'yu döner */
        System.out.println(scores.get("Bert"));
    }
}
