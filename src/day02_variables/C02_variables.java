package day02_variables;

public class C02_variables {
    public static void main(String[] args) {

        //java calismaya main metoddan baslar
        //sonra yukaridan asagi, soldan saga dogru calisir

        // eger istersek bir variable' once deklare edip sonra deger atayabiliriz

        String okulIsmi;

        // java deger atamasi yapmadigimiz bir variables olusturmaniza itiraz etmez
        //ancak deger atamasi yapincaya kadar o variablei kullanmaniza izin vermez



        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);   // Yildiz koleji

        okulIsmi="Star Koleji";
        System.out.println(okulIsmi  );  // Star koleji

        // println ile print arasindaki fark
        //println dedigimizde yazdirma islemi alt satira gecerken
        // sadece print dedigimizde yazdirma islevinden sonra alt satira gecmez

        okulIsmi="Java Koleji";
        System.out.print(okulIsmi);

        System.out.println(okulIsmi);


    }
}
