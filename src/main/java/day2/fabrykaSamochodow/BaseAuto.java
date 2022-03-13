package day2.fabrykaSamochodow;

abstract  public class BaseAuto implements Auto {
    public int cena;
    public String kolor;
    int maxPredkosc;

    public BaseAuto(int cena, String kolor) {
        this.cena = cena;
        this.kolor = kolor;
    }


}
