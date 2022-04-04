package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zevkli";

        //str in ilk 4 harfini almak istesek
        str.substring(0,4);

        // Bir program yaparken kodlarimizi daha kisa ve anlasilir olmasi icin
        //surekli kullanabilecegimiz kod bloklarini hazir olarak bir yere koyar
        //ihtiyacimiz oldukca oradan alir kullaniriz.

        //methodlar robotlara benzer
        //method olusturmak bazen o methodun yapacagi isi yapmaktan zor olabilir
        //bir islemi sadece bir defa yapacaksak method kullanmaya gerek olmayabilir
        //ancak ozellikle cok kulllanacagimiz islemler icin her seferinde yeniden ayni kodlari yazmak yerine
        //bu islemi yapan hazir bir method olusturmak cok daha pratiktik.

        //bazen bir classin icerisinde cok uzun kodlar yazarsak tum classin anlasilmasi zorlasabilir
        //bunun yerine kod un belli kisimlarini ayri methodlar olusturup
        //main method icerisinde istedigimiz sekilde bu methodlari yonetebiliriz


    }
}
