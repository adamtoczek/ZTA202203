package day2.fabrykaSamochodow;

public class BMW extends BaseAuto{

    public BMW(int cena, String kolor) {
        super(cena, kolor);
    }

    @Override
    public int maxPredkosc() {
        return 200;
    }

    void pajacuj() {

    }
}
