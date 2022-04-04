package day05_matematiksellesme;

public class C01_PreIncrementPostIncirement {
    public static void main(String[] args) {


        int sayi= 10;
        //bu sayiyi bir arttirmak istersek

        sayi++;
        System.out.println(sayi); //11

        sayi++;
        System.out.println("pre-increment:"+ sayi);//12

        //13. ve 14. satirda yaptigim 2 islem tek satirda yaparsam
        //java iki islemden once hangisini yapacagini bilmek ister
        //once artirir sonra yazdirirsak java yeni degeri yazdirir
        //ama once yazdirir sonra arttirirsak bu durumda eski deger yazdirir

        System.out.println("pre-increment satirinda:"+ ++sayi); //13    once artir sonra yazdir
        System.out.println("pre-increment sonra:" + sayi ); //13


        System.out.println("post-increment satirinda"+ sayi++); //13  once yazdirir sonra arttirir
        System.out.println("post-increment satirinda"+sayi); //14







    }
}
