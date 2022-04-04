package day08_ifElseIfStatements;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <='z')) {


        System.out.println("Girdiginiz bir karakterdir");
    } else {
        System.out.println("girdiginiz bir karakter degildir");}


    }
}
