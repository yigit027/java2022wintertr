package day08_ifElseIfStatements;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz:"+"\n kadin icin  K  \n erkek icin E");

        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0||yas>120){
                System.out.println("Girdiginiz yas degeriniz kontrol ediniz");
            }else if (yas<60){
                System.out.println("Emekli olamazsiniz     :"+(60-yas)+"emeklilige kalan yiliniz");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet=='E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Girdiginiz yas degeriniz kontrol ediniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsiniz     :" + (65 - yas) + "emeklilige kalan yiliniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }


        }
    }
}
