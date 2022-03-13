package day2.uczniowie;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Szkola {
    public static void main(String[] args) {
        Student student = new Student("Adam", "Kwiatkowski", "19991010");
        Podstawowkarz pachole = new Podstawowkarz("Marian", "Rakieta", "20121224");
        Licealista licealista = new Licealista("Kasia", "Kwiatkowska", "20090101");

        List<Uczen> lista = new ArrayList<>();
        lista.add(student);
        lista.add(pachole);
        lista.add(licealista);

        for (Uczen u : lista) {
            u.przedstawSie();
            System.out.println(((Podstawowkarz)u).dodaj(2,3));
        }

        student.dodaj(2,3);
        licealista.poleKola(6);
        student.poleKola(7);
    }
}

interface IUczen {
    void przedstawSie();
}

abstract class Uczen implements IUczen {
    String imie;
    String nazwisko;
    LocalDate dataUrodzenia;

    public Uczen(String imie, String nazwisko, String dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia, DateTimeFormatter.BASIC_ISO_DATE);
    }

    @Override
    public void przedstawSie() {
        System.out.println(imie + " " + nazwisko);
    }
}

class Podstawowkarz extends Uczen {
    public Podstawowkarz(String imie, String nazwisko, String dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
    }

    protected int dodaj(int a, int b) {
        return a + b;
    }
}

class Licealista extends Podstawowkarz {
    public Licealista(String imie, String nazwisko, String dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
    }

    public double poleKola(int r) {
        System.out.println(Math.PI * r * r);
        return Math.PI * r * r;
    }
}

class Student extends Licealista {
    public Student(String imie, String nazwisko, String dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
    }

    @Override
    public double poleKola(int r) {
        System.out.println("Studenci licza pole kola tylko z calek");
        return super.poleKola(r);
    }

    public void calka() {
        System.out.println("studenci umieja calki");
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println("Mam " + ChronoUnit.YEARS.between(dataUrodzenia, LocalDate.now()) + " lat.");
    }
}
