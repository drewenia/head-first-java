package io.drewenia.writingAProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = bufferedReader.readLine();
            if (inputLine.length() == 0){
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        return inputLine;
    }
}
