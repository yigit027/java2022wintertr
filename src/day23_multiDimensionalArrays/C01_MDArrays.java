package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);// 7

        System.out.println(arr[1][1]);//10

        //ilk inner arrayin tum elementlerini yazdirin

        System.out.println(arr[0]);// arr[0] bir array oldugundan direk yazdirilamaz referansini yazdirir
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]

        System.out.println(Arrays.toString(arr));//[[I@340f438e, [I@30c7da1e]  referans numarasini verir.

        //multidimensional de tum elementleri bir array olarak yazdirmak istersek deepToString methodu kullaniriz

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]

    }
}
