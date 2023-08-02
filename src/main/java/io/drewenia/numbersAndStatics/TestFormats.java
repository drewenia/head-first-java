package io.drewenia.numbersAndStatics;

import java.util.Date;

public class TestFormats {
    public static void main(String[] args) {
        Date date = new Date();
        String format = String.format("%tA, %<tB %<td",date);
        System.out.println(format);
    }
}
