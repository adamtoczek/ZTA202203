package day2.warzywniak;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Warzywniak {
    public static void main(String[] args) {
        Banan banan = new Banan(12, 3, new Color(234, 168, 0));
        Pomarancz pomarancz = new Pomarancz(21, 2, new Color(255, 106, 0));
        Jablko jablko = new Jablko(7, 1, new Color(229, 27, 27));
        Pomidor pomidor = new Pomidor(4,20, new Color(154));


        List<BaseOwoc> listaOwocow = new ArrayList<>();
        listaOwocow.add(banan);
        listaOwocow.add(pomarancz);
        listaOwocow.add(jablko);
        listaOwocow.add(pomidor);

        for (BaseOwoc o : listaOwocow) {
            System.out.println(o.pobierzWage());
        }

        System.out.println(listaOwocow.get(listaOwocow.indexOf(jablko)).pobierzWage());
//        System.out.println(listaOwocow.get(0));

    }
}
interface Owoc {
    default int pobierzCene() {
        return 0;
    }
    int pobierzWage();
}
abstract class BaseOwoc implements Owoc{
    int cena;
    int waga;
    Color kolor;

    @Override
    public String toString() {
        return "" +cena ;
    }

    public BaseOwoc(int cena, int waga, Color kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
class Pomidor extends BaseOwoc {

    public Pomidor(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

}

class Pomarancz extends BaseOwoc {


    public Pomarancz(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

}
class Jablko extends BaseOwoc {

    public Jablko(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

}

class Banan extends BaseOwoc {

    public Banan(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }
}
