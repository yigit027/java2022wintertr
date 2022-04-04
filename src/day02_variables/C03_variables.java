package day02_variables;

public class C03_variables {

    public static void main(String[] args) {

        String ogrenciIsmi = "Melih";

        ogrenciIsmi="Furkan";

        // bir variables deklare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak deklare edilen variable tekrar deklare edilemez

        ogrenciIsmi= "Abdullah";

    //String ogrenciIsmi="Abdullah" atamasi yapilmaz

        String isim, soyisim, dogumYeri;

        isim= "Nihat";
        soyisim= "Ozel";
        dogumYeri="Ankara";

        System.out.println(soyisim);
        System.out.println(dogumYeri);
        System.out.println(isim);


        String tcNo= "12345676534436";
        String hiclik="";

        //String non primitive oldugu icin biz sadece data saklamak degildir
        //ekstra bazi ozellikleri de kullanabiliriz
        //eger tc ni, okulnumarasi veya tlf numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islem kullanilmayan
        //degerler icin de String kullanilabilir

        String harf= "A";



        //bu ikisi icinde ayni durum gecerli
        // ben A harfi icin bir variable char olarakta olusturabilirim String olarakta olusturabilirim
        //eger sadece saklayacaksak char kullanilabiliriz
        // String ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir





    }
}
