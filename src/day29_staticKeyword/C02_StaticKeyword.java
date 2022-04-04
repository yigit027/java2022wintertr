package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {



            // baska class'daki static class uyelerine
            // ulasabilmek icin sadece classIsmi.static UyeIsmi
            // yazmamiz yeterlidir


            System.out.println(C01_Static.okulTelefonu); // 3122563635

            C01_Static.okulTelefonu = "3125474747";
            System.out.println(C01_Static.okulTelefonu); // 3125474747

            // Baska class'daki static olamayan class uyelerine
            // ancak o class'dan obje olusturarak ulasabiliriz
            // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

            C01_Static obj1 = new C01_Static();
            C01_Static obj2 = new C01_Static();

            System.out.println(obj2.okulIsmi); // Yildiz koleji
            obj2.okulIsmi = "Sabir koleji";
            System.out.println(obj2.okulIsmi);// Sabir koleji
            System.out.println(obj1.okulIsmi); // Yildiz koleji

        // obj2 atama yapildi ve sabir koleji yazdirdi fakat obj1
        // atama yapilmadi ve okul ismini orjinal haliyle yazdirdi.
    }
}
