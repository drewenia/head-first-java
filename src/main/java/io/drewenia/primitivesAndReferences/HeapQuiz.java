package io.drewenia.primitivesAndReferences;

public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] heapQuizs = new HeapQuiz[5];
        while (x < 3) {
            heapQuizs[x] = new HeapQuiz();
            heapQuizs[x].id = x;
            x += 1;
        }
    }
}
