package Day1;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        final int size = 5;
        String[] imiona = new String[size];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<imiona.length; i++) {
            System.out.print("Podaj imie: ");
            imiona[i] = in.nextLine();
        }

        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Czesc "+imiona[i]);
        }

        for (String imie : imiona)
            System.out.println("Czesc "+imie);


        int n;
        System.out.print("Podaj ilosc elementow: ");
        n = in.nextInt();
        int[] tab = new int[n];
        for (int i=0; i< tab.length; i++) {
            tab[i] = i+1;
        }


        int i=0;
        while (i<tab.length) {
            System.out.println(tab[i]);
            i++;
        }


    }
}
