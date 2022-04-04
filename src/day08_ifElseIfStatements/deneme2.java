package day08_ifElseIfStatements;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if(not<0||not>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }else if (not<60){
            System.out.println("Notunuz J");
        }else if (not<20){
            System.out.println("notunuz I");
        }else if (not<30){
            System.out.println("Notunuz H");
        }else if (not<40){
            System.out.println("Notunuz G");
        }else if (not<50){
            System.out.println("Notunuz F");
        }else if (not<60){
            System.out.println("Notunuz E");
        }else if (not<70){
            System.out.println("notunuz D");
        }else if (not<80){
            System.out.println("notunuz C");
        }else if (not<90){
            System.out.println("notunuz B");
        }else{
            System.out.println("Notunuz Excellent");
        }



    }
}
