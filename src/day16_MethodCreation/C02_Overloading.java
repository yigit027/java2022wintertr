package day16_MethodCreation;

public class C02_Overloading {
    public static void main(String[] args) {

        //overloadin demek asiri yukleme demektir

        String str="Bu da gecer ya huu";
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("a",5));//13
        System.out.println(str.indexOf('a',5));



        //bir classta ayni isimde birden fazla method olmasina overloading denir
        //ya parametre sayisi farkli olmali
        //veya parametre sayisi ayni ise argumentlerin data turleri farkli olmali


    }
}
