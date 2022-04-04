package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {

        //


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");

        String soyIsim=scan.nextLine();
        System.out.println("isim-soyisim:"+isim+"  "+soyIsim);


    }
}
