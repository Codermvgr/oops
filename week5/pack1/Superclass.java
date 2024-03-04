package pack1;

public class Superclass {
    public int a = 10;
    private int b = 20;
    protected int c = 30;


    public Superclass() {
        System.out.println("In super class");
        System.out.println("public:" + a);
        System.out.println("private:" + b);
        System.out.println("protected:" + c);
    }
    public int getb() {
        return b; // private variable 'b' accessible with in the class
    }
}
