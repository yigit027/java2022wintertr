package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        //verilen bir arrayi listeye cevirin


        String arr[]={"A", "B","C"};

        List<String>arraydenList=Arrays.asList(arr);

        //Arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz dolayisiyla bu yeni liste ile
        //add remove ve clear gibi methodlar calistirmak istedigimizde java exception olusur.

        //arraydenList.add("J");  bu calisirsa exception olur  UnsupportedOperationException  hatasi verir.

        System.out.println("21");
        arr[1]="F";


    }
}
