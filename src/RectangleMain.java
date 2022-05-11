import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width, height;

        System.out.println("Enter Width:");
        width = input.nextDouble();

        System.out.println("Enter Height:");
        height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Perimetter is " + rectangle.getPeri());
        System.out.println("Area is " + rectangle.getArea());
    }
}

    class Rectangle {
        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }


        public double getPeri() {
            return (this.height + this.width) * 2;
        }

        public double getArea() {
            return (this.height * this.width);
        }

    }
