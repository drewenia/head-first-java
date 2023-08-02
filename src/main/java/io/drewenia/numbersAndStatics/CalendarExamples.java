package io.drewenia.numbersAndStatics;

import java.util.Calendar;

public class CalendarExamples {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // year, month, date, hourOfDay, minute
        calendar.set(2023, Calendar.JANUARY, 7, 15, 40);
        long hour = calendar.getTimeInMillis();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // burada 15 çıktısı üretilir
        hour += 1000 * 60 * 60; // hour variable'ina ms cinsinden 1 saat ekler
        calendar.setTimeInMillis(hour); // Bir saatlik milisaniye eklendikten sonra zamanı güncelleyin.
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 1 saat eklendiği için 16 çıktısı üretilir
        calendar.add(Calendar.DATE,35); // tarihe 35 gün ekler
        System.out.println("add 35 days " + calendar.getTime());
        calendar.roll(Calendar.DATE,35); // tarihe 35 ekler fakat ayı DEĞİŞTİRMEZ
        System.out.println("roll 35 days " + calendar.getTime());
        calendar.set(Calendar.DATE,1); // Burada bir artırma yapmıyoruz, sadece tarihi "ayarlıyoruz" (set ediyoruz).
        System.out.println(calendar.getTime());
    }
}
