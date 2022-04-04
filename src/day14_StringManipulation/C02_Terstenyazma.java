package day14_StringManipulation;

public class C02_Terstenyazma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi ilk harfi buyuk digerlerini kucuk olarak
        // tersten yazdirin.

        String input="Mavi";
        String tersStr=input.substring(3).toUpperCase()+
                       input.substring(2,3).toLowerCase()+
                       input.substring(1,2).toLowerCase()+
                        input.substring(0,1).toLowerCase();
        System.out.println(tersStr);

     // touppercase ile harfi buyutebiliriz\





    }
}
