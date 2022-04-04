package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //Elementleri forloop ile yazdiralim

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");


        // bunu for-Each loop ile yaparsak
        //for each loopu calistirmak icin hedef bir collection vermeliyiz

        for (int each :arr
             ) {
            System.out.print(each+" ");

            // avantaji : index baslangic - degeri bitis degeri gibi detaylarla ugrasmamiza
            // gerek kalmadan collection dan tum elementleri getirir.

            //dezavantaji  :  index e bagli bir islem yapamayiz

        }

    }
}
