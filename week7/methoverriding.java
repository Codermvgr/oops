class Parent {
    void print() {
        System.out.println("This is a Parent method");
    }

}

class Child extends Parent {
    void print() {

        System.out.println("This is a Child method");
    }
}

public class methoverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }

}
