package Day1;

public class Metody {
    public static void main(String[] args) {
        System.out.println("2+5 = "+add(2l,5l));
        System.out.println("10-2 = "+substract(10,2));
        System.out.println("2*5 = "+multiply(2,5));
        System.out.println("10/3 = "+divide(10,3));

        String text = "361";
        int a = Integer.parseInt(text);
        a*=2;
        System.out.println(a);

        int b = 10;
        int c = 3;
        /*
        (double) b - operacja kastowania zmiennej b (ktora jest intem) na typ double.
         */
        double wynik = (double) b / c;
        /*
        kropka wskazuje ze 10 jest zmiennoprzecinkowe, bez kropki jest traktowane jako int co powoduje ze wynik
        dzielenia bylby traktowany jako int
         */
        double d = 10./3;

        long x = 3l;

        System.out.println(wynik);

        System.out.println(Klasa.add(3,2));
        Klasa abc = new Klasa();
        System.out.println(abc.add(3));

    }

    static long add(long a, long b) {
        return a+b;
    }
    static int substract(int a, int b) {
        return a-b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }

    static double divide (int a, int b) {
        return (double) a / b;
    }


}
