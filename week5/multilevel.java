import java.util.Scanner;
class Point {


    public final double pi = 3.141;
    private float x, y;


    public Point() {
        x = 0;
        y = 0;
    }


    public Point(float a, float b) {
        x = a;
        y = b;
    }


    void printpoint() {
        System.out.println("(x,y)" + " = " + "(" + x + "," + y + ")");
    }


}
class Circle extends Point {
    protected float radius;


    public Circle(float r) {
        super();
        radius = r;


    }


    public Circle(float a, float b, float r) {
        super(a, b);
        radius = r;
    }


    double area() {


        return pi * radius * radius;
    }


    double circumference() {


        return 2 * pi * radius;
    }


    double getradius() {
        return radius;
    }


}
class Sphere extends Circle {


    public Sphere(float r) {
        super(r);
    }


    public double area() {
        return 4 * pi * radius * radius;
    }


    public double volume() {
        return 4 * pi * radius * radius * radius / 3;
    }
}
public class multilevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r;
        System.out.print("Enter the radius of sphere : ");
        r = input.nextInt();
        Sphere s1 = new Sphere(r);
        System.out.println("Volume: " + s1.volume());
        System.out.println("Total Surface area : " + s1.area());
        input.close();
    }


}
