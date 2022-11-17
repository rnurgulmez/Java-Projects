public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        System.out.println(getDurationString(-1,45));
        System.out.println(getDurationString(3945));
    }
    private static String getDurationString(long minutes, long seconds) {
        if((minutes<0) || (seconds<0) || (seconds>59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "h";
        if(hours < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "h";
        if(hours < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString +  "  " + minutesString + "  " + secondsString + " ";
    }
    private static  String getDurationString(long seconds) {
        if(seconds<0) {
            //daha sonra invald value gibi birden fazla yerde kullandıklarımız için constant kullanacağız.
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }
}