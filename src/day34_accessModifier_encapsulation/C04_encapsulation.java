package day34_accessModifier_encapsulation;

public class C04_encapsulation {
    public static void main(String[] args) {

        /*bir varaible`i encapsule etmek icin
        1- Access modifier i private yapariz
        2-okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabilriz
            -eger sadece okunmasini istiyorsaniz getter
            -sadace deger girilebilsin isterseniz setter
            methodlarini olustururuz.


            Bir varaible icin hem getter hem setter olusturursaniz o variable pablic olmus gibi hem
            okuyup hemde yazilmasini saglayabilirsiniz

            Piyasada developerlar arasinda genel uygulama da boyledir.


         */
        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("java java java");

        System.out.println(obj.getStr());//java java java

        System.out.println(obj);//sayi=0, str='java java java

    }
}
