package day05_matematiksellesme;

public class C06_wrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        // verilen iki string'deki syilari toplayin

        System.out.println( str1 + str2 ); // 1234523456
        System.out.println(Integer.valueOf(str1) +  Integer.valueOf(str2) ); // 35801

        // Integer.valueOf(str1) methodu sadece sayisal deger iceren String'lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata verir




        String str7="4532";
        String str8="1453";

        System.out.println(str7+str8);
        System.out.println(Integer.valueOf(str7)+Integer.valueOf(str8));

        String str9="12350";
        String str10="98765";

        System.out.println(Double.valueOf(str9)+Double.valueOf(str10));

        String str11="12350";
        String str12="98765";

        System.out.println(Long.valueOf(str11)+Long.valueOf(str12));

        String str13="12350f";
        String str14="98765f";

        System.out.println(Float.valueOf(str13)+Float.valueOf(str14));

    }
}
