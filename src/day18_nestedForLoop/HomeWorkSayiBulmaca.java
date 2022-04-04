package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkSayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        //Random (rastgele demek)
        Random rnd=new Random();
        int sayi= rnd.nextInt(100);//burasi 100 den kucuk rastgee bir sayi olustur.

        Scanner scan= new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while (sayi!= tahmin){
            System.out.println("lutfen bir sayi giriniz");
            tahmin= scan.nextInt();

            if (tahmin>sayi){
                System.out.println("daha kucuk bir sayi soylemelisin");


            }else if(tahmin<sayi){
                System.out.println("daha buyuk bir sayi soylemelisin");

            }
            sayac++;
        }
        System.out.println("Tuttugunuz sayiyi  :"+sayac+" tahmin bulundu ");
    }
}
