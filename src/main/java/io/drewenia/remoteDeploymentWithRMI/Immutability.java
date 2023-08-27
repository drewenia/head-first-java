package io.drewenia.remoteDeploymentWithRMI;

public class Immutability {
    public static void main(String[] args) {
        String s = "0";
        for (int i=0;i<10; i++){
            s = s + i;
        }
    }
}
