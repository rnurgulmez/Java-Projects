public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));

    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start,int end) {
        int sumOfTheOddNumber = 0;
        if(start > 0 && end >= start) {
            for (int i = start; i<=end; i++) {
                if(isOdd(i)) {
                    sumOfTheOddNumber = sumOfTheOddNumber + i;
                }
            }
            return sumOfTheOddNumber;
        } else {
            return -1;
        }
    }
}