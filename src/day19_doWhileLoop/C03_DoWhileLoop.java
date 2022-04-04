package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //do  (yapmak demek)

        //kullanicidan pozitif bir tamsayi
        // While loop ile 5 ten kucuk pozitif tamsayilari yazdiralim

        int input=5;

        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }
        //ayni soruyu dowhile ile yapalim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);
    }
}
