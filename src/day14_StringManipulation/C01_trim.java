package day14_StringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str= "   siz ne derseniz deyin java bildigini okur    ";
        //str.trim();   bu data ile olmaz
        str.trim();
        System.out.println(str);  //siz ne derseniz deyin java bildigini okur boslukludur
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str);//siz ne derseniz deyin java bildigini okur
        System.out.println(str.length());





    }
}
