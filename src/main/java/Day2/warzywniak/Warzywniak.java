package Day2.warzywniak;

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
            o.pobierzCene();
        }


    }
}
interface Owoc {
    int pobierzCene();
    int pobierzWage();
}
abstract class BaseOwoc implements Owoc{
    int cena;
    int waga;
    Color kolor;

    public BaseOwoc(int cena, int waga, Color kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzWage() {
        return 0;
    }
}
class Pomidor extends BaseOwoc {

    public Pomidor(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

    @Override
    public int pobierzCene() {
        return 0;
    }

}

class Pomarancz extends BaseOwoc {


    public Pomarancz(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

    @Override
    public int pobierzCene() {
        return 0;
    }

}
class Jablko extends BaseOwoc {

    public Jablko(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

    @Override
    public int pobierzCene() {
        return 0;
    }

}

class Banan extends BaseOwoc {

    public Banan(int cena, int waga, Color kolor) {
        super(cena, waga, kolor);
    }

    @Override
    public int pobierzCene() {
        return 0;
    }
}
