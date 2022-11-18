public class Main {
    public static void main(String[] args) {
        boolean x = isCatPlaying(false, 25);
        System.out.println(x);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else if (summer == false) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}