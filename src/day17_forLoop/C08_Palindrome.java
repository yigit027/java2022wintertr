package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        //palindrome bir kelimenin hem duz hem tersten okunarak ayni anlama gelmesine denir
        //or madam,nalan gibi

        String input= "kelek";
        palindromeKontrolEt(input);
    }


    private static void palindromeKontrolEt(String input) {
        String terstenInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime palindrome");
        } else {
            System.out.println("girdiginiz kelime palindrome degil");
        }
    }
}