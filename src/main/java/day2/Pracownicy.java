package day2;

import java.util.ArrayList;
import java.util.List;

class Kierownik extends Pracownik {
    int premia;

    public Kierownik(String imie, String nazwisko, int wiek, int premia) {
        super(imie, nazwisko, wiek);
        this.premia = premia;
    }
}
class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    Pracownik kierownik;



    public Pracownik(String nazwisko, int wiek) {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        setWiek(wiek);
    }

    public Pracownik(String imie, String nazwisko, int wiek, Pracownik kierownik) {
        this(imie, nazwisko, wiek);
        this.kierownik = kierownik;
    }

    public Pracownik getKierownik() {
        return kierownik;
    }

    public void setKierownik(Pracownik kierownik) {
        this.kierownik = kierownik;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane() {
        System.out.println("Imie: "+getImie() +"\tNazwisko: "+getNazwisko()+"\tWiek: "+getWiek());
        if (kierownik != null) {
            System.out.println("Kierownikiem jest: ");
            kierownik.pobierzDane();
        }

    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        if (wiek < 0)
            this.wiek = 0;
        else
            this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

public class Pracownicy {
    public static void main(String[] args) {
        Kierownik wlasciciel = new Kierownik("Michal", "Malinowski", 56, 300);
        Pracownik sprzedawca = new Pracownik("Karol", "Kowalski", 17, wlasciciel);
        Pracownik kasjer = new Pracownik("Yunus", "Patel", -167, wlasciciel);


//        System.out.println(sprzedawca.imie + sprzedawca.nazwisko + sprzedawca.wiek);
//        System.out.println(kasjer.imie + kasjer.nazwisko + kasjer.wiek);
        sprzedawca.pobierzDane();
        kasjer.pobierzDane();
        wlasciciel.pobierzDane();

        System.out.println(sprzedawca);

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(sprzedawca);
        listaPracownikow.add(kasjer);
        listaPracownikow.add(wlasciciel);

        System.out.println(listaPracownikow);
    }
}
