package day09_ternarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=20;
        //verilen sayinin 3 basamakli olup olmadigini kontrol eden bir ternary yazdiriniz

        String sonuc=sayi>99 ?"sayi 3 basamakli veya daha buyuk":"sayi negatif veya 3 basamaktan kucuk";



        //ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun data turune uygun bir variable aatama yapabiliriz
        System.out.println("girdiginiz sayi analizi:"+sonuc);
    }
}
