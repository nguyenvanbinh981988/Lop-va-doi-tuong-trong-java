import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.println("Enter a:");
        a = input.nextDouble();

        System.out.println("Enter b:");
        b = input.nextDouble();

        System.out.println("Enter c:");
        c = input.nextDouble();

        QuadraticEquation phuongTrinh = new QuadraticEquation(a,b,c);
        phuongTrinh.nghiem();
    }
}


class QuadraticEquation{
    double a,b,c;

    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void nghiem(){
        double delta = b*b - 4*a*c;
        if (delta==0){
            System.out.println("The equation has a roots: " + (b/(-1))/(2*a));
        } else if (delta<0){
            System.out.println("The equation has not roots: ");
        } else {
            double X1 = ((b/(-1))+Math.sqrt(delta))/(2*a);
            double X2 = ((b/(-1))-Math.sqrt(delta))/(2*a);
            System.out.println("The equation has 2 roots: " + X1 + " and " + X2);
        }
    }
}
