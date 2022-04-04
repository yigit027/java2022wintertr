package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;

        //variable nin degerlerini degistirmeden asagidaki
        // ifadeleri bu variable leri kullanarak yazdiriniz

        //java5guzel

        System.out.println(str1+sayi1+str2);

        //2guzel15
        System.out.println((sayi1-sayi2)+(str2)+(sayi1*sayi2));
       // System.out.println((sayi1-sayi2+str2+sayi1*sayi2); buda oluyor ama ben yazdiramadim

        //  java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //java22

        //   53guzel
        System.out.println(sayi1+(sayi2+str2));  //53guzel
        System.out.println(""+sayi1+sayi2+str2);  //53guzel

        /* eger tamamen sayilardan olusan bir string varsa ve biz int`a ceirmek istersek
        Intiger.valueOf(str)

        bir sayiyi stringe cevirmek istersem bir hiclikle toplarim
        ornek= " "+sayi
         */
    }
}
