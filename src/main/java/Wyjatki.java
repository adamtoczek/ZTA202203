import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {

        int[] tab = {3,5,8,4,1};
        int index;
        Scanner in = new Scanner(System.in);



        boolean success = false;
        while (!success) {
            try {
                System.out.println("Podaj index z tabeli ");
                index = in.nextInt();
                System.out.println(tab[index]);
                success = true;
            } catch (IndexOutOfBoundsException a) {
                System.out.println("Wyszedles poza zakres, index to 0 do " + (tab.length - 1));
//                in.skip(".*");
            } catch (InputMismatchException b) {
                System.out.println("to nie jest liczba");
//                in.skip(".*");
            } catch (Exception e) {
                System.out.println("Nieznany problem, sprobuj ponownie");
            }
            finally {
                in.nextLine();
            }
        }


    }
}
