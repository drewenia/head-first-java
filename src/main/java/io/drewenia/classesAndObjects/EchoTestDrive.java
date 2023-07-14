package io.drewenia.classesAndObjects;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo echo1 = new Echo();
        Echo echo2 = new Echo();
        int x = 0;
        while (x < 4) {
            echo1.sayHello();
            echo1.helloCount = echo1.helloCount + 1;
            if (x < 5) {
                echo2.helloCount = echo2.helloCount + 1;
            }
            if (x > 0){
                echo2.helloCount = echo2.helloCount + echo1.helloCount;
            }
            x += 1;
        }
        System.out.println(echo2.helloCount);
    }
}
