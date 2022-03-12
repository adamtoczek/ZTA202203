import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) throws InterruptedException {
        int sec;

        System.out.print("Na ile nastawic bombe? : ");
        Scanner in  = new Scanner(System.in);
        sec = in.nextInt();

        if (sec > 0) {
            for (int i = 0 ;i <= sec ; i++) {
                System.out.println("Bomba wybuchnie za "+ (sec - i));
                Thread.sleep(1000);
            }



//            while (sec >=0 ) {
//                System.out.println("Bomba wybuchnie za "+sec);
//                Thread.sleep(100);
//                sec--;
//            }

//            do {
//                System.out.println("Bomba wybuchnie za "+sec);
//                Thread.sleep(100);
//                sec--;
//            }
//            while (sec >= 0);

        }
        else if (sec == 0) {
            System.out.println("BUM! bomba wybuchla Ci w rekach");
        }
        else
            System.out.println("Podroze w czasie sa jeszcze nie obslugiwane");


    }
}
