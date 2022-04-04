package day27_constructor;

public class Toyota {


    String marka = "Toyota";
    int tekerAdedi = 4;
    boolean motoruVarMi = true;
    String model;
    String yakit;
    int yil;

    public void maxHi() {
        if (yakit.equals("benzin")) {
            System.out.println("benzinli araclar  max 240 km hiz yapar");
        } else if (yakit.equals("dizel")) {
            System.out.println("dizel araclar  max 260 km hiz yapar");
        }

    }
        public void renkTercihler() {
            if (model.equals("corolla")) {
                System.out.println("corolla ");

            }


        }
}







