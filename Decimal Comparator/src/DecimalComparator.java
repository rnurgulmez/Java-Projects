public class DecimalComparator {
    //numbers must be equal up to 3 decimal places
    public static boolean areEqualByThreeDecimalPlaces(double no1,double no2){
        if(no1<0 && no2>0 || no1>0 && no2<0){
            return false;
        }

        double no1Thousand = no1*1000;
        double no2Thousand = no2*1000;

        int no1int = (int) no1Thousand;
        int no2int = (int) no2Thousand;

        if(no1int==no2int){
            return true;
        }
        return false;
    }
}
