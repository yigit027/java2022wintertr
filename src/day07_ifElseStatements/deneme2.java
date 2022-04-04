package day07_ifElseStatements;

import java.awt.*;
import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.nextLine();

        if (isim.equals("ayse") || isim.equals("seyda") || isim.equals("ozlem") || isim.equals("faika") || isim.equals("selma") ||
                isim.equals("gamze")){
        System.out.println(" Bayan isimler");}

        if (isim.equals("mahmut")  ||isim.equals("ali")||  isim.equals("recep")||isim.equals("Muhammed")||isim.equals("hasan"))
        {System.out.println("bay isimleri");
        }  else {
            System.out.println("hayvan isimleri");
        }






    }
}
