package day13_stringManipulation;

public class C00_replaceFirst {
    public static void main(String[] args) {

        // buldugu ilk harfi degistirmek istedigimiz bir karakterle yer degistirir.
        String str="Bugunlerde nesemiz yerinde";

        System.out.println(str.replaceFirst("u","a"));
        System.out.println(str.replaceFirst("n","V"));
        System.out.println(str.replaceFirst("d","x"));
        System.out.println(str.replaceFirst("ler","*"));
        System.out.println(str.replaceFirst("\\w","*"));
        System.out.println(str.replaceFirst("\\S","#"));
    }
}
