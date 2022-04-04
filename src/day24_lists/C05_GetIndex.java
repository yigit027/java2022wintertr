package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {

        //list`te olan sayi varsa onu getirir.Index ini veririz hangi indekte ise bize dondurur

        List<Integer> sayilarListe=new ArrayList<>();
        sayilarListe.add(5);// [5]
        sayilarListe.add(3);// [5,3]
        sayilarListe.add(0,7);//[7,5,3]
        sayilarListe.add(2,7);//[7, 5, 7, 3]

        System.out.println(sayilarListe.get(2));//7

        System.out.println(sayilarListe);//[7, 5, 7, 3] liste degismeden duruyor




    }
}
