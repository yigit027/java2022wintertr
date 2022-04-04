package day21_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        // Array i nasil deklare ederiz
        //data turu arrayin ismi ve koseli parantez yazarak array deklare edilir

        int arr1[]={1,2,3};
         int[]arr2={1,4,7};
         int [] arr3={1,3,5};

         double arr4[]={2.3,20.5};

         String arr5[]={"ali","veli","nur"};
         // assing(esittir) sart mi?

        int sayi;

        int arr6[];
        //kullanmadan once mutlaka deger atamasi yapmamiz gerekir
        // hem deklare edip hem de atama yapacaksam nasil yapabilirim
        // 1-   deklare edip esitligin sagina suslu parantez icerisinde degerleri yazabilirim
        String arr7[]={"ali","veli","nur"};

        // 2-   icine deger atamadan olusturmak isterseniz,boyutunu belirlememiz gerekir

        int arr8[]=new int[5];//java icinde 5 tane defoult deger olan bir array olusturur
                              //[0,0,0,0,0]


        double arr9[]= new double[7];
        System.out.println(Arrays.toString(arr9)); //[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        arr9[1]=0.1;   // bu sekilde Array e atama yapiyoruz
        arr9[4]=3.6;
        arr9[6]=9.0;
        arr9[0]=5.5;
        arr9[3]=8.8;
        System.out.println(Arrays.toString(arr9));//[5.5, 0.1, 0.0, 8.8, 3.6, 0.0, 9.0]

        arr9[0]=9.9; //0 inci index i atama yaparak degistirdim
        System.out.println(Arrays.toString(arr9));//[9.9, 0.1, 0.0, 8.8, 3.6, 0.0, 9.0]

    }
}
