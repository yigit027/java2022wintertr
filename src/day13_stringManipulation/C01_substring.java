package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="java ile IT cok guzel";
        System.out.println(str.substring(5));  // ile IT cok guzel
        // yukardaki String i  Mehmet hoca ile IT cok guzel yazalim

        System.out.println(str.replace("java","mehmet hoca"));
        System.out.println("mehmet hoca "+str.substring(5));
        System.out.println(str.substring(9));// yazilan index inclusive(dahil)

        //eger bir indexten sona kadar olan bir parcayi degil belirli bir parcayi almak istersek
        // iki parametre yazmak gerekiyor
        //str.substring(baslangicIndexi,bitisIndex)
        //baslangic indexi==>Inclusive(dahil)
        // bitis index==>eclusive(haric)
        System.out.println(str.substring(0,5));//java
        System.out.println(str.substring(0,1));//j

        String harf=str.substring(5,6);//bana 6. harfi string olarak bulun
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//hiclik dondurur

        //System.out.println(str.substring(5,2));//bitis index i baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));// son harfi verir
        System.out.println(str.substring(str.length()-7));// son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir




    }
}
