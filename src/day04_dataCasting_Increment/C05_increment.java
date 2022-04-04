package day04_dataCasting_Increment;

public class C05_increment {

    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10); // 30
       //bu satirda sayiyi 10 arttirmadim
        //sayinin 10 fazlasini yazdirdim

        System.out.println(sayi); //20

        //eger atama yapmazsak sayida yaptigimiz arttirma veya azalyma kalici olmaz

        sayi=sayi+10;

        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);//40

        System.out.println(sayi); //40


        System.out.println(sayi+=10);
        System.out.println(sayi);

        // bir varaiblen degerini kalici olarak arttirmak veya azaltmak assigment sarttir

        System.out.println("31.satirda : "+ sayi++);//50
        System.out.println("32 satirda :" +sayi); //51

        System.out.println("34.satirda : "+ ++sayi);//52
        System.out.println("35 satirda :" + sayi); //52


    }
}
