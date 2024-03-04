import pack1.Superclass;


class Subclass extends Superclass {
    public Subclass() {
        super();
        System.out.println("In sub class");
        System.out.println("public:" + a);
        System.out.println("private:" + "private member cannot be accessed");
    }


    int getc() {
        return c; // protected variable accessible within the class and inherited class
    }
}


public class Simplepublic {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        System.out.println("In main(): Subclass inherits public Superclass");
        System.out.println("public:" + obj.a);
        // System.out.println("private:" + obj.b); // b has private access in Superclass
        // System.out.println("protected:" + obj.c); // c has protected access in
        // Superclass


        System.out.println("private:" + obj.getb());
        System.out.println("protected:" + obj.getc());
    }
}
