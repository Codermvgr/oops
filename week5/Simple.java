import java.util.Scanner;


class Rectangle {
    private float length, breadth;


    public Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }
    public double area() {
        System.out.print("AREA: ");
        return length * breadth;
    }
    public double perimeter() {
        System.out.print("PERIMETER: ");
        return 2 * (length + breadth);
    }
    public void printlengthbreadth() {
        System.out.println("length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}
class Square extends Rectangle {
    private float side;


    public Square(float a) {
        super(a, a);
        side = a;
    }


    public void printside() {
        System.out.println("Side: " + side);
    }
};
public class Simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a;
        System.out.print("Enter the side of a square : ");
        a = input.nextFloat();
        Square s = new Square(a);
        System.out.println(s.perimeter());
        System.out.println(s.area());
        input.close();
    }
}
