package day33_varargs_stringBuilder;

public class C04_StrinBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("yasasin java");

        sb1.indexOf("java"); //javanin index ini verir
        System.out.println(sb1.indexOf("java")); // 8

        sb1.lastIndexOf("s");
        System.out.println(sb1.lastIndexOf("s"));//4

        sb1.indexOf("s");
        System.out.println(sb1.indexOf("s"));//2

        sb1.replace(0,7,"ne guzel");
        System.out.println(sb1.replace(0,7,"ne guzel"));//ne guzell java

        System.out.println(sb1);//ne guzell java

        System.out.println(sb1.toString().toUpperCase());//NE GUZELL JAVA
        System.out.println(sb1);//ne guzell java     //toString Stringe cevirdigi icin String immutuble oldugu icin cumlede degismedi

        System.out.println(sb1.delete(0,3));// guzell java

        System.out.println(sb1.deleteCharAt(5));// guzel java


    }
}
