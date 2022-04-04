package day32_dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-03-31T19:31:36.952479300


        tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5);
        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));


    }
}
