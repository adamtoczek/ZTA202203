package day2.fabrykaSamochodow;

public class Audi extends BaseAuto{

    public Audi(int cena, String kolor) {
        super(cena, kolor);
    }

    @Override
    public int maxPredkosc() {
        return 215;
    }
}
