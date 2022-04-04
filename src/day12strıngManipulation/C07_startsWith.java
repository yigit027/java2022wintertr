package day12strıngManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        String kelime= "bugun havada cok toz var";

        System.out.println(kelime.startsWith("b"));
        System.out.println(kelime.startsWith("bug"));
        System.out.println(kelime.startsWith("t"));
        System.out.println(kelime.startsWith("bugun"));

    }
}
