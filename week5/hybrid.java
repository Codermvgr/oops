import java.util.Scanner;
import java.lang.Math;


abstract class Geometry {
    public final double pi = 3.141;
    abstract public double area();
    abstract public double perimeter();
}
abstract class Polygon extends Geometry {
    private int num;
    public Polygon(int n) {
        num = n;
    }
    void shape() {
        System.out.print("Shape: ");
        if (num == 3) {
            System.out.println("TRIANGLE");
        } else if (num == 4) {
            System.out.println("QUADRILATERAL");
        } else {
            if (num < 3)
                System.out.println("NOT A POLYGON");
            else
                System.out.println("POLYGON");
        }
    }
    void setsides(int n) {
        num = n;
    }
    abstract public double area();
    abstract public double perimeter();
}
class Triangle extends Polygon {
    private float a, b, c;
    private double base, height;
    private float s;
    private double ar;
    public Triangle(float a, float b, float c) {
        super(3);
        this.a = a;
        this.b = b;
        this.c = c;
        s = (a + b + c) / 2;
        ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        base = (a < b && a < c) ? a : (b < c) ? b : c;
        height = ar * 2 / base;
        if (ar != ar || ar == 0) {
            System.out.println("Triangle is not formed with given sides");
            setsides(0);
            s = 0;
            ar = 0;
        }
    }
    Triangle(float b, float h) {
        super(3);
        base = b;
        height = h;
        ar = (base * height) / 2;
    }
    public double area() {
        return ar;
    }
    public double perimeter() {
        return 2 * s;
    }
    void printsides() {
        System.out.println("The sides of triangle : " + a + "," + b + "," + c);
    }
}
class Quadrilateral extends Polygon {
    private float a, b, c, d;
    private float s;
    private double ar;
    public Quadrilateral(float a, float b, float c, float d) {
        super(4);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        s = (a + b + c + d) / 2;
        ar = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d));
        if (ar != ar || ar == 0) {
            System.out.println("Quadrilateral is not formed with given sides");
            setsides(0);
            s = 0;
            ar = 0;
        }
    }
    public Quadrilateral(float s) {
        super(4);
        a = s;
        b = s;
        c = s;
        d = s;
    }
    public double area() {
        return ar;
    }
    public double perimeter() {
        return 2 * s;
    }
    void printsides() {
        System.out.println("The sides of quadrilateral : " + a + "," + b + "," + c + "," + d);
    }
}
public class hybrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c, d;
        System.out.print("Enter the sides of triangle : ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        Triangle t = new Triangle(a, b, c);
        t.shape();
        System.out.println("calling methods from Triangle");
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
        System.out.print("Enter the sides of cyclic quadrilateral : ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        d = input.nextFloat();
        Quadrilateral q = new Quadrilateral(a, b, c, d);
        q.shape();
        System.out.println("calling methods from Quadrilateral");
        System.out.println("Perimeter: " + q.perimeter());
        System.out.println("Area: " + q.area());
        input.close();
    }
}
