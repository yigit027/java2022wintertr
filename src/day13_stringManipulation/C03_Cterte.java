package day13_stringManipulation;

public class C03_Cterte {
    public static void main(String[] args) {

        //Compile Time Error(CTE) : kodumuzu yazarken kod altinin kirmizi cizgi olmasi
        //Run Time Error (RTE):Kod calistiginda(Execute) karsilastigimiz hatalar

       // int sayi="ali can";
                              //Intigere String atayamazsiniz buna syntex hatasi denir
                             //syntex hatalarini java yazdigimizda gorur ve altini cizer
                             //tum projede alti cizili bir kod varsa
                             //projede hicbir class calismaz

        String str="Javada hersey zamanla oturur";
        System.out.println(str.substring(5000)); //hata verdi class calisir fakat calisinca hata verir



    }
}
