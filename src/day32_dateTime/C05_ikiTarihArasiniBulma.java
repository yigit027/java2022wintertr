package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1981,05,16);

        System.out.println(Period.between(dogumGunu,bugun));//P40Y10M15D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//40



    }
}
