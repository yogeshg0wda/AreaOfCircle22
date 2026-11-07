
public class AreaOfCircle {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle();

        double radius = 5;

        System.out.println("Area of Circle: "
                + obj.calculateArea(radius));
    }
}
