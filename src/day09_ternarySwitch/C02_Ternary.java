package day09_ternarySwitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Ternary ile yapilan tum isler if else ile de yapilabilir
        //if else terine ternary tercih etme sebebi yapinin basit ve anlasilir olmasidir
        //ternary icerisinde komplex kodlar olmaz
        //sadece sonuc veya bixi sonuca goturen basit islemeler olabilir.

        //kullanicidan bir tamsayi alin
        //tek mi ciftmi yazdiraan bir kod yazin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else {
            System.out.println("sayi tektir");
        }

        System.out.println(sayi%2==0?"sayi cift":"sayi tek");

    }
}
