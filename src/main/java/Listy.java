import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();

        for (int i = 0; i<100; i++) {
                liczby.add(i);
        }

        for (Integer v : liczby) {
            if (v%2 == 0) {
                int index = liczby.indexOf(v);
                liczby.set(index, v*2);
            }
        }



        for (Integer v : liczby)
            System.out.println(v);
    }

}
