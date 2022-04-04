package day13_stringManipulation;

public class denemesubtring {
    public static void main(String[] args) {


        String str1 ="bugun dunyanin en guzel insanlari kendi aralarinda sohbet ediyorlar";

        System.out.println(str1.substring(5));
        System.out.println(str1.replace("dunyanin","kainatin"));
        System.out.println("hizmet"+str1.substring(51));
        System.out.println(str1.substring(51));

        System.out.println(str1.substring(23,51));
        System.out.println(str1.substring(0,1));
        System.out.println("kainatin "+str1.substring(14));
        System.out.println(str1.substring(57));
        System.out.println(str1.replace("kendi",""));
        System.out.println(str1.replace("ediyorlar","edecekler"));





    }
}
