package day16_MethodCreation;

public class azra {
    public static void main(String[] args) {

        String str = "bugun hayvanat bahcesine gittik aslan,kaplan,sirtlan,maymun,kaplumbaga,tavus kusu";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));

        }
    }
}