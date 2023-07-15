package io.drewenia.methodsUseInstanceVariables;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime("1234");
        String tod = clock.getTime();
        System.out.println("time : " + tod);
    }
}
