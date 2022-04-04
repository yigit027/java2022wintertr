package day11_stringManipulation;

public class  C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";
        //istersek char olarak verdigimiz bir harfin indexini bize dondurur

        System.out.println(str1.indexOf('J')); //0

        //istersek bir harf ya da metin olarak verdigimiz String in indexini dondurur
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        // ayni harften birden fazla varsa
        System.out.println(str1.indexOf("5"));// 5         buldugu ilk dogru eslestirmenin indexini donduru

        System.out.println(str1.indexOf('b',5));

        // bu metodda java aramaya fromindex olarak yazdigimiz indexten itibaren baslar
        //(inclusive)

        //verilen Stringdeki ikinci a harfinin index ini bulalim

        int ilkindex=str1.indexOf('a');  //1

        System.out.println(str1.indexOf('a',ilkindex+1));  //3


        int ilkbindex=str1.indexOf("b");  //1

        System.out.println(str1.indexOf("b",ilkbindex+1));  //9




    }

}
