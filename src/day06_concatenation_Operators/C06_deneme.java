package day06_concatenation_Operators;

public class C06_deneme {
    public static void main(String[] args) {

        System.out.println(5+2==8);
        System.out.println(7+3==10);

        boolean sonuc1= 5>1&& 7<9&&10>9&&3>2&&5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2= 3>4&& 8>5&& 9<8&& 5+2!=8;
        System.out.println(sonuc2);

        boolean sonuc3= 4>3&&5<4&&9<10&&1000>999&&6+9!=14;
        System.out.println(sonuc3);

        boolean sonuc4= 4>5 & 6<7& 8+9==16;
        System.out.println(sonuc4);


        boolean sonuc5= 7<8&&9>1&&12+5==17;
        System.out.println(sonuc5);

     boolean sonuc6 = 2>1&&5>4&&9>1&&1+2==3;
        System.out.println(sonuc6);

        int sayi4=20;
        System.out.println(sayi4>10&&21>sayi4);

        int sayi6=10;
        System.out.println(sayi6<11 ||sayi6<9);

        int sayi5= 15;
        System.out.println(sayi5>16 || sayi5<14);



    }
}
