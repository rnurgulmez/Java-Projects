public class Main {
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 13);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(100);
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return (int) centimeters;
    }

    public static int calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to "+feet+ " feet and "+ remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }


}


