package Day2;

class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    Pracownik kierownik;

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
}

public class Pracownicy {
    public static void main(String[] args) {
        Pracownik sprzedawca = new Pracownik();
        Pracownik kasjer = new Pracownik();
        Pracownik wlasciciel = new Pracownik();

        sprzedawca.setImie("Karol");
        sprzedawca.setNazwisko("Kowalski");
        sprzedawca.setWiek(7);
        sprzedawca.setKierownik(wlasciciel);


        kasjer.setImie("Yunus");
        kasjer.setNazwisko("Patel");
        kasjer.setWiek(-137);
        kasjer.setKierownik(wlasciciel);

        wlasciciel.setImie("Michal");
        wlasciciel.setNazwisko("Malinowski");
        wlasciciel.setWiek(56);




//        System.out.println(sprzedawca.imie + sprzedawca.nazwisko + sprzedawca.wiek);
//        System.out.println(kasjer.imie + kasjer.nazwisko + kasjer.wiek);
        sprzedawca.pobierzDane();
        kasjer.pobierzDane();
        wlasciciel.pobierzDane();

    }
}
