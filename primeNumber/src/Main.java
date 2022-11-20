import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrimeNumber = false;

        System.out.println("***Welcome***");
        System.out.println("Please enter a number : ");

        int number = scanner.nextInt();


        for (int i=2;i<number;i++) {
            if(number%i == 0) {
                isPrimeNumber = false;
                break;
            } else {
                isPrimeNumber = true;
            }
        }
        if(isPrimeNumber) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}