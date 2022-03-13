package day2.fabrykaSamochodow;

public class Mercedes extends BaseAuto{

    public Mercedes(int cena, String kolor) {
        super(cena, kolor);
    }

    @Override
    public int maxPredkosc() {
        return 230;
    }
}
