package Day1;

import java.util.Scanner;

public class MojPierwszyProgram {
    public static void main(String[] args) {
//        String imie;
        Scanner in = new Scanner(System.in);
//        System.out.print("Podaje imie: ");
//        imie = in.nextLine();
//        switch (imie) {
//            case "Agata" :
//            case "Agnieszka" :
//            case "Gabriela" :
//                System.out.println("Czesc "+imie);
//                break;
//            default:
//                System.out.println("Nie znam Cie");
//        }


        int waga;
        String owoc;
        String owocu = "";
        System.out.print("Podaj nazwe owocu: ");
        owoc = in.nextLine();


        switch (owoc) {
            case "banany":
                owocu = "Bananow";
                break;
            case "jablka":
                owocu = "Jablek";
                break;
            case "pomarancze":
                owocu = "Pomaranczy";
                break;
            default:
                System.out.println("nie ma takiego owocu");

        }

        if (!owocu.isEmpty()) {
            System.out.print("Podaj wage: ");
            waga = in.nextInt();

            if (waga > 100) System.out.println(owocu + " jest za duzo o " + (waga - 100));
            else if (waga > 0) System.out.println(owocu + " jest w sam raz, zmiesci sie jeszcze " + (100 - waga));
            else System.out.println("nie ma " + owocu);
        }
    }

}

