package day03_scanner;

public class C03_swap {
    public static void main(String[] args) {


        int sayi1= 30;
        int sayi2=20;

        System.out.println("Swaptan önce sayı1 : " + sayi1 + " " + "sayi2 : " + sayi2);
        sayi1= sayi1+sayi2;//sayı1=30
        sayi2=sayi1-sayi2;//sayı2=10
        sayi1=sayi1-sayi2;//sayı1=20

        System.out.println("Swaptan sonra sayı1 : " +sayi1 +" " + "sayı2 :" +sayi2);
    }
}
