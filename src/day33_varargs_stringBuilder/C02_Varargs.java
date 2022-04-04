package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        // parametre olarak bir integer ve istedigimiz kadar String alam en uzun kelimenin harf sayisi ile integer
        // parametre degerinin carpir sonucu yazdiran bir method olusturun


        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        //bir methodda vaarags disinda bir method kullanacaksak
        //once deiger parametreleri yazip vararg`i en sona yazmaliyiz.
        //bu sebeple bir methodda birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String...str) {

        String enUzunStr="";

        for (String each:str) {

            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;


            }
        }System.out.println("istenen deger  :"+sayi*enUzunStr.length());
    }

}
