package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        //boyutlari belirli bir array i elemntleri girmeden olusturalim
        // bir okulda icinde 24 ogrenci bulunan 8 sinif vardir

        int arr[][]=new int[8][24];

        //bir ilcede herbirinde 24 ogrencilik 8 sinif bulunan 5 okul vardir

        int ilce [][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kisilik 2 tanede 22 kisilik sinif vardir  /// bunu yapamayiz arraylerde toplama cikarma yok

        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][22];

        // olustururken elementleri atama yaparsak farkli uzunlukta inner ler tanimlayabiliriz

        int arr1[][]={{3,1,7,5},{6,10}};



    }
}
