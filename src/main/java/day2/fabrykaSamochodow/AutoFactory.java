package day2.fabrykaSamochodow;

public class AutoFactory {
    public static BaseAuto getAuto(int maxV) {
        if (maxV <=200)
            return new BMW(150000, "czarny");
        else if (maxV > 200 && maxV <= 215)
            return new Audi(145000, "srebrny");
        else
            return new Mercedes(200000, "poziomkowy");
    }
}
