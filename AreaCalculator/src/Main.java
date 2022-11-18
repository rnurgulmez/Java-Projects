public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.0));
    }

    public static double area(double radius) {
        if(radius<0) {
            return -1.0;
        }
        return Math.pow(radius, 2)*Math.PI;
    }

    public static double area(double x,double y) {
        if(x<0 || y<0) {
            return -1.0;
        }
        return x*y;
    }
}