package day12strıngManipulation;

import java.awt.*;
import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        // Kullanicidan isim soyisim bilgisiniz alip
        // butun harfleri * yapalim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isiminizi ve soyisminizi yaziniz");
        String isimSoyisim=scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));





    }
}
