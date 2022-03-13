package day2.fabrykaSamochodow;

public class Samochody {
    public static void main(String[] args) {
        BaseAuto auto1;

        auto1 = AutoFactory.getAuto(199);
        System.out.println(auto1.getClass());
        System.out.println(auto1.maxPredkosc());



        auto1 = AutoFactory.getAuto(200);
        System.out.println(auto1.getClass());
        System.out.println(auto1.maxPredkosc());


        auto1 = AutoFactory.getAuto(215);
        System.out.println(auto1.getClass());
        System.out.println(auto1.maxPredkosc());

        auto1 = AutoFactory.getAuto(216);
        System.out.println(auto1.getClass());
        System.out.println(auto1.maxPredkosc());



        /*
        a
        aa
        aaa
        aaaa
        aaaaa

         */
    }
}
