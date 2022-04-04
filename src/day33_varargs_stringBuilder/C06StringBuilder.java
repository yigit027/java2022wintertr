package day33_varargs_stringBuilder;

public class C06StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin"));//Prize dikkat edin
       String str="hayatta cok guzel seyler vardi";

        System.out.println(sb1.insert(0,str,0,8 ));//hayatta Prize dikkat edin

        System.out.println(sb1.reverse());//nide takkid ezirP attayah  tersine yazdirir

        System.out.println(sb1.reverse());//hayatta Prize dikkat edin  tekrardan duzeltti


        System.out.println(sb1.substring(3,5)); // at
        System.out.println(sb1); // Hayatta Prize dikkat edin.

        System.out.println(sb1.subSequence(3,5)); // at
        System.out.println(sb1); // Hayatta Prize dikkat edin.

    }
}
