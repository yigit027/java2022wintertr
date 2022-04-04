package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("java cok guzel");
        StringBuilder sb3= new StringBuilder(10);


        System.out.println("sb1 length: "+sb1.length());//0
        System.out.println("sb1 capacity :  "+sb1.capacity());//16

        System.out.println("sb2 length: "+sb2.length());//14
        System.out.println("sb2 capacity :  "+sb2.capacity());//30

        System.out.println("sb3 length: "+sb3.length());//0
        System.out.println("sb3 capacity :  "+sb3.capacity());//10

       // append methodu ile String Builder e ekleme yapabiliriz

        sb1.append("java");
        sb1.append("java").append("cok").append("guzel");// gibi de yazilabilir
        System.out.println("sb1 length: "+sb1.length());//14
        System.out.println("sb1 capacity :  "+sb1.capacity());//16

        sb1.append(3);
        System.out.println(sb1);//javajavacokguzel3

        sb1.append(true);
        System.out.println(sb1);//javajavacokguzel3true

        System.out.println("sb1 length: "+sb1.length());//21
        System.out.println("sb1 capacity :  "+sb1.capacity());//34

        sb1.append("tum dersler java olsa");
        System.out.println("sb1 length: "+sb1.length());//42
        System.out.println("sb1 capacity :  "+sb1.capacity());//70

        sb1.trimToSize();  //fazlaligi trim yapip atiyor

        System.out.println("sb1 length: "+sb1.length());//42
        System.out.println("sb1 capacity :  "+sb1.capacity());//42


    }
}
