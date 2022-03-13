package Day1;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(-1));
        System.out.println(isPrimeNumber(0));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(4));
    }

    //2,3,5,7
    //-1,0,1,4
    static boolean isPrimeNumber(int a) {
       if (a<2)
           return false;
       if (a==2)
           return true;
       if (a%2==0)
           return false;

       for (int i = 3; i < a/2; i+=2) {
           if (a%i==0)
               return false;
       }

       return true;
    }



}


