package day05_matematiksellesme;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayi1=20;
        Short sayi2=30;
        sayi1=sayi2;  // wrapper class ile ayni isimdeki primitive data turu arasinda gecis olabilir
        System.out.println(sayi1); // 30
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.BYTES); // 2 Byte=16 bit
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

    }
}
