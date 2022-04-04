package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {


        boolean dogruMu= true;
       // String str= dogruMu    //sol strin olup sag boolean olunca prg calistirmaz


        byte sayi1=44;
        System.out.println(sayi1);

        short sayi2= sayi1;// esitligin solu short, sagi ise byte olmasina java itiraz etmiyor.
                            //deger olarak atanan data turu varaible data turunden kucuk oldugu icin java sorun yapmaz
                            //Auto widining
        System.out.println(sayi2);

        double sayi3= sayi2;
        System.out.println(sayi3);






    }
}
