package day03_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        // kullanicidan yari cap isteyip
        // cemberin cevresini ve dairenin alanini yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cemberin yari capini giriniz");

        double yaricap = scan.nextDouble();
        System.out.println("girdiginiz yari cap:" + yaricap);
        System.out.println("cemberin cevresi:" + 2 * 3.14 * yaricap);
        System.out.println("dairenin alani:" + 3.14 * yaricap * yaricap);


    }
}
