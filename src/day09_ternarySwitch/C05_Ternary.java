package day09_ternarySwitch;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary deki iki sonucun data turleri farkli olabilir

        //verilen sayi 100`den buyukse sayi`nin karesini alip yazdirin
        //100`den kucukse "sayi 100`den buyuk olmali"yazdiran
        //bir ternary olusturalim

        int sayi=150;

         //ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        // eger sonuclar farkli data turundeyse
        //atama yapacagimiz variable`in data turu tek olacagindan
        //atama yapamayiz
        //SADECE direk yazdirabiliriz
        System.out.println(sayi>100?sayi*sayi:"sayi 100`den buyuk olmali");



    }
}
