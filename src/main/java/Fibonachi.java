public class Fibonachi {
    public static void main(String[] args) {
        int size = 10;

        int[] fibo = new int[size];

        fibo[0] = 1; //index 0
        fibo[1] = 1; //index 1

        for (int i = 0; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int k : fibo)
            System.out.println(k);




    }
}
