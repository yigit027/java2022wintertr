package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_NotuHArfeCevirme1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayi=scan.nextDouble();

        if(notSayi<0||notSayi>100){
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }
        else if (notSayi<50){
            System.out.println("notunuz D");
        }else if (notSayi<60){
            System.out.println("Notunuz C");
        }else if (notSayi<80){
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");
        }
    }
}
