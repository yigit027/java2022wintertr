package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; //deger atamasi yapmadik ama java kabul etti. ancak kullanmamiza izin vermez

       // arr={1,2,3}; kabul etmedi

        arr=new int[6];//kabul etti

        //System.out.println(Arrays.toString(arr));//deger atamasi yapilmadigi icin kabul etmiyor

        System.out.println(Arrays.toString(arr));//[0,0,0,0,0,0]
        System.out.println(arr.length);//6
                                       //String teki length(),  burada yoktur

        //array deki her bir elemani index degeri kadar attiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;


        }
        System.out.println(Arrays.toString(arr));

        // son indexteki elementi yazdiralim

        System.out.println(arr[arr.length-1]);// 5 i yazdirir




    }
}
