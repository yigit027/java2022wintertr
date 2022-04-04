package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        // verilen bir Arrayden istenen elementi silip kalanlari
        // yeni bir Array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);

    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1-- istenmeyen element sayisini bulunuz.

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenmeyenEleman);
            sayac++;

        }

        //2--yeni Arrayi olusturalim
        int arrYeni[]=new int[arr.length-sayac];

        //3-- eski arrayden uygun elementten yeniye tasi

        for (int i = 0; i < arr.length; i++) {

            int index=0;
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }

        }
        //4  Yeni arrayi yazdirin
        System.out.println(Arrays.toString(arrYeni));

    }
}
