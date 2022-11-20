import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i=10; i<50; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number "+i+" is a prime number.");
                if(count == 4) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        //prime number can be divided evenly only by 1 or by itself.
        //whole number has to be greater than 1.
        //so first we need to test to see wheter it is 1.
        if (n == 1) {
            return false;
        }
        // n/2 is just an optimization technique just to save a bit of time for the computer.
        //For i<= n/2... The definition of prime is that it has no divisors other than 1
        // or itself (e.g. 3 is not a divisor of 8). Anything greater than half
        // its value CANNOT be a divisor. So there's no reason to check anything above half the number's value.
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " +i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}