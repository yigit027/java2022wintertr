package day05_matematiksellesme;

public class C02_PreIncrementPostIncirement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi1 +","+sayi2+"," +sayi3);


        sayi3=++sayi1;

        System.out.println(sayi1 +", " + sayi2 +","+ sayi3);

        System.out.println(sayi3++); // once yazdiracak sonra arttiracak
                                     //once 12 yazdiracak sonra sayi=13

        System.out.println(--sayi2); //once azalt sonra yazdir
                                     // once sayi2=9 sonra sayi2 nin son degeri yani 9


        double sayi5=20;
        double sayi6=30;
        double sayi7=40;

        sayi5=sayi6++;

        System.out.println(sayi5 +"," +sayi6+"," +sayi7);

        sayi7=++sayi6;
        System.out.println();


        System.out.println(sayi5 +"," +sayi6+"," +sayi7);

        sayi5=sayi6++;

        System.out.println(sayi5 +"," +sayi6+"," +sayi7);

    }
}
