package day03_scanner;

public class C02_swapvaraibles {
    public static void main(String[] args) {

        //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
        //program yaziniz
        //Orn : sayi1=10 ve sayi2=20;
        //kod calistiktan sonra
        //sayi1=20 ve sayi2=10

       int sayi1=10;
       int sayi2=20;

        System.out.println("swaptan once sayi1:" + sayi1+ "    sayi2:"+   sayi2);

        // 1 adim bos bir variable olusturup sayi1 ona atayalim

        int temp=sayi1;

        //2.adim sayi1 yeni degerini atayalim

        sayi1=sayi2;

        //3. Adim sayi2 ye tempe yedekledigimiz sayi1 i atayalim

        sayi2=temp;

        System.out.println("swaptan sonra sayi1:" +   sayi1+ "   sayi2:" +sayi2);







    }
}
