public class Main {
    public static void main(String[] args) {
        //Since we will exit the loop after 5 numbers,
        //we need a counter and an initial variable
        // to get their sum we have defined them.
        int count = 0;
        int sum = 0;
        //the range given to us is between 1 and 1000
        for (int i = 1; i <= 1000; i++) {
            //and now we have to check that it is divisible by both 3 and 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }

        }

        System.out.println("Sum = " + sum);


    }
}