import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/1/22 21:29
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the radius:");
        double radius = in.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("the area is " + String.format("%.2f", circle.getArea()));
        System.out.println("the Perimeter is " + String.format("%.2f", circle.getPerimeter()));
    }

    static class Circle {
        double radius;

        public Circle(){}

        public Circle(double radius) {
            this.radius = radius;
        }

        double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        double getPerimeter() {
            return 2 * Math.PI * this.radius;
        }
    }
}
