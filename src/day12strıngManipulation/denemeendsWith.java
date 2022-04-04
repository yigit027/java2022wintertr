package day12strıngManipulation;

import java.util.Scanner;

public class denemeendsWith {
    public static void main(String[] args) {

        String cumle = "Yahudilikte oruç, günahtan dolayı duyulan pişmanlığın bir göstergesidir; oruç tutmak suretiyle " +
                "tevbe edilir. Tutulan orucun, işlenen günahlara kefaret olması ve bu sayede günahlardan temizlenilmesi" +
                " umulur. Bazen de toplumun başına gelen birtakım felâketlerin insanların günahlarından kaynaklandığı " +
                "düşüncesiyle oruç tutulur. Oruç aynı zamanda bir matem nişanıdır. Yahudi tarihinin en felâketli günleri" +
                " oruç tutularak yâd edilir. ";
        String kelime = "dolayi";


        int ilkKullanim = kelime.indexOf(kelime);
        int sonKullanim = kelime.lastIndexOf(kelime);

        if (ilkKullanim == -1) {
            System.out.println("aranan kelime cumlede yoktur");
        } else if (sonKullanim == ilkKullanim) {
            System.out.println("aranan kelime cumlede 1 defa vardir");
        } else {
            System.out.println("aranan kelime cumlede 1 den fazla vardir");
        }

    }
}
