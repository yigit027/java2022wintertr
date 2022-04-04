package day10_switch_StringManipulation;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi yaziniz");
        String isminizSoyisminiz=scan.nextLine();

        System.out.println(isminizSoyisminiz.replaceAll("\\s","*"));




    }
}
