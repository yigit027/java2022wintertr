package day03_scanner;

import java.util.Scanner;

public class denemedikdortgenkareSCAN {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen diktortgenin buyuk ve kucuk kenarlarini yaziniz");

        double bkenar1=scan.nextDouble();
        double kkenar2=scan.nextDouble();

        System.out.println("buyuk kenar giriniz"+bkenar1+"kucuk kenar giriniz:"+kkenar2);
        System.out.println("dikdortgenin cevresi:"+(bkenar1+kkenar2)*2);
        System.out.println("dikdortgenin karesi"+bkenar1*kkenar2);

    }
}
