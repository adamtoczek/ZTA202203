package day2;

import static day2.Dzialania.mnozenie;

public class Mnozenie {
    public static void main(String[] args) {
        double a = mnozenie(2,3);
        int b = (int) mnozenie(2.,2);
        double c = mnozenie(3,4,5);

    }

}
class Dzialania {
    static int mnozenie(int a, int b) {
        System.out.println("int int "+a*b);
        return a*b;
    }
    static double mnozenie(double a, double b) {
        System.out.println("double double "+a*b);
        return a*b;
    }

    static int mnozenie(int a, int b, int c) {
        System.out.println("3xInt "+a*b*c);
        return a*b*c;
    }
}

