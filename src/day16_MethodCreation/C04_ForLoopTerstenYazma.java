package day16_MethodCreation;

public class C04_ForLoopTerstenYazma {
    public static void main(String[] args) {

        //verilen String i tersten yazdiran bir kod yaziniz

        String str="valla bu java cok zevklidir";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));

        }











    }
}
