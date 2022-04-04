package day08_ifElseIfStatements;

import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir not giriniz");
        double not = scan.nextDouble();

        if (not < 10) {
            System.out.println("girdiginiz not: j");
        } else if (not < 20) {
            System.out.println("girdiginiz not :   I");

        } else if (not < 30) {
            System.out.println("girdiginiz not : H");
        } else if (not<40){
            System.out.println("girdiginiz not  G");
        }else if (not<50){
            System.out.println("girdiginiz not:  F");
        }else if (not<60){
            System.out.println("girdiginiz not:  E");
        }else if(not<70) {
            System.out.println("girdiginiz not:  D");
        }else if (not<80){
            System.out.println("girdiginiz not  : C");
        }else if (not<90){
            System.out.println("girdiginiz not : B");
        }else {
            System.out.println("girdiginiz not :A");
        }


    }
}
