public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarkingNow,int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if(isDogBarkingNow == true && hourOfDay<8 || hourOfDay>22){
            return true;
        }else {
            return false;
        }
    }
}
