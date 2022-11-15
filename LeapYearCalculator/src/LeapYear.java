public class LeapYear {

    public static boolean isLeapYear (int year) {
        //0) greater than or equal to 1 and less than or equal to 9999.
        if (year < 1 || year > 9999) {
            return false;
        }

        //1) If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5
        if (year % 4 != 0 ) {
            return false;
        }

        //2) If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        if (year % 100 != 0) {
            return true;
        }

        //3) If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5
        if (year % 400 != 0) {
            return false;
        }

        //4) The year is a leap year (it has 366 days)
        return true;
    }
}