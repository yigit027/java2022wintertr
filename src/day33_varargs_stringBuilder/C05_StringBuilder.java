package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        //Compare iki sb`i esitmi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        //ayni karakterler icin birsey yazdirmaz farkli olan ilk karakter icin ascii tablosuna gore kac deger geride
        //veya ileride oldugunu yazdirir.
        //tamamamen ayni ise bize sifir dondurur

        //bir String builder ile String compare etmek istersek java Cte eder

        StringBuilder sb1=new StringBuilder("Ali Can");

        StringBuilder sb2= new StringBuilder("Ali Can");

        String str ="Ali Can";

        System.out.println(sb1.compareTo(sb2));//  -32

       // System.out.println(sb1.compareTo(str));  // Cte yapti
    }
}
