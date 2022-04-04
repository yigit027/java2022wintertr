package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 yada daha buyukse emekli olabilirsin
        // 65 kucuk ise emekli olmazsin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();


        if (yas>=65) {
            System.out.println("emekli olabilirsin");
            System.out.println(yas-65+"yil oldu emekli olali");
        }else{
            System.out.println("emekli olamazsin");
        System.out.println(65-yas+"sene daha calismalisin");

        }
        // if else statmentte iki durumda sadece ve sadece biri calisir
        //ikisinin birden calisma ihtimali ======yoktur
        //ikisinide calismamam ihtimali var mi ====yoktur
    }
}
