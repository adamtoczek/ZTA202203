package Day2;

public class DzieckoDziadek {
    public static void main(String[] args) {
        Dziecko brzdac = new Dziecko("Adam", "Krzykacz", 1);


        System.out.println(brzdac.imie + brzdac.nazwisko + brzdac.wiek);
        brzdac.spiewa();
    }
}
interface JakisInterfejs {
    void metod2();
}

abstract class CzlonekRodziny {
    String nazwiskoRodowe;
    abstract void metoda1();
    void metodaZwykla() {
        System.out.println("zwykla metoda");
    }
}
class Dziadek extends CzlonekRodziny implements JakisInterfejs{
    String imie;

    @Override
    public void metod2() {

    }

    public void metoda1() {

    }


    public Dziadek(String imie) {
        this.imie = imie;
    }

    void spiewa() {
        System.out.println("w ogole");
        metodaZwykla();
    }
}
class Rodzic extends Dziadek {
    String nazwisko;

    public Rodzic(String imie, String nazwisko) {
        super(imie);
        this.nazwisko = nazwisko;
    }
//    void spiewa() {
//        super.spiewa();
//        System.out.println("soprano-tenor");
//    }
}
class Dziecko extends Rodzic {
    int wiek;

    public Dziecko(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko);
        this.wiek = wiek;
    }

    void spiewa() {
        super.spiewa();
        System.out.println("piszczy");
    }
}
