package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"ali","veli","ayse"};
        //array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]);//ali
         arr1[1]="esila";
        System.out.println(arr1[1]);//esila

        //array icindeki index i kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
       // System.out.println(arr2[5]);///ArrayIndexOutOfBoundsException

        //arrayin tamamini yazzdirmak istersek
        System.out.println(arr2);//[I@511baa65 (referansi)
                                 // arrayler non primitiv olduklarindan direk yezdirmek
                                 //istersek java referans bilgisini yazdirir

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i]+"");//0 0 0 0

        }
        System.out.println("");
        //array i yazdirmak icin javadaki arrays classindan toString() kullanilir

        System.out.println(Arrays.toString(arr2));//[0,0,0,0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));//[0,11,0,22]

        System.out.println(Arrays.toString(arr1));//["ali","veli","esila"]

    }
}
