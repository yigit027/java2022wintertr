package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf= scan.next().charAt(0);
        //charAt(index) metodu parametre olarak yazdigimiz indexden chari bize getirir
        // Stringde index 0 dan baslar
        // E r s i n
        System.out.println("girdiginiz ismin ilk harfi:"+ilkHarf);




    }
}
