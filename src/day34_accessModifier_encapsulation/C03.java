package day34_accessModifier_encapsulation;

public class C03 {
    // burada encapsule edecegimiz iki class olsun

    private int sayi;
    public String str;



    public int getSayi() { //getter
        return sayi;
    }




    public String getStr() { //getter
        return str;
    }



    public void setStr(String str) {//setter
        this.str = str;



    } @Override
    public String toString() {
        return
                "sayi=" + sayi +
                ", str='" + str ;
    }
}
