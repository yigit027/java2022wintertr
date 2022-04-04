package day03_scanner;


import java.util.Scanner;

public class C04_scanner {

    public static void main(String[] args) {

        //scanner kullanmak icin 3 adim takip ediyoruz
        // 1. adim kendimize bir scan olusturmak

        Scanner scan= new Scanner(System.in); // esitligin saginda yeni bir scanner olusturulur olusturulan
                                              // bu scanner scan variablina Assing edilir.
                                              // scan variablin ismidir istedigimiz ismi verebiliriz
        //2.adim kullanicidan istedigimiz degeri girmesi icin aciklayici bilgi yazdirin

        System.out.println("lutfen isminizi giriniz");
        // 3. adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        //String kullaniciIsmi= scan.next();//sadece ilk kelimeyi alir ilk bosluga kadar alir

        String kullaniciIsmi= scan.nextLine();
        System.out.println("kullanicinin girdigi isim:"+ kullaniciIsmi);







    }
}
