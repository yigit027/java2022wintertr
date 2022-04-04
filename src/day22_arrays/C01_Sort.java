package day22_arrays;

import java.sql.Array;
import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        //sort demek verilen arrayleri alfabetik yada numaratik olarak siralar.

        String arr[]={"s","M","A","T"};
        System.out.println(Arrays.toString(arr)); // [S,M,A,T]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [A,M,S,T]

        int arr1[]={1,2,5,9,4,3,7,0};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //java da bu siralamaya natural Order denir.
       // sayi olursa kucukten buyuge
        //metin olursa alfabetik olarak yapar



    }

}
