package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // String metodlarini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk yazdiralim

        //str.charAt (0) boyle yazdigimizda sonuc artik String degil char olacaktir
        //dolayisiyle String de yapmak istedigimiz tum degisiklikleri
        // once yapip sonra charAt() metodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));// JAVA GUZELDİR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}