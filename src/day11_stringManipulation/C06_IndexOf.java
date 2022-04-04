package day11_stringManipulation;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel valla cok guzel";
        // 20 indexten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel", 20));

        //String de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type i index
        //yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih eder

        //kullanicidan mail adresini isteyiniz  @ isretini icermiyorsa gecersiz yazdirin
        //iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen mailinizi yaziniz");
        String mail = scan.next();

        if (mail.indexOf("@") == (-1)) {
            System.out.println("gecersiz");

        } else {
            System.out.println("mailiniz kabul edildi");

            // OZET : indexOf method'u icerise yazilan String veya char'in
            // metinde hangi index'de oldugu bize dondurur
            // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
            // bize -1 dondurur

        }


    }
}

