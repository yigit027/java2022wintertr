package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="java gun gectikce guzellesiyor";

       String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[java, gun, gectikce, guzellesiyor]
        System.out.println(kelimeler[1]);//gun

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));//[java gun ,  guzellesiyor]

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]

    }
}
