class Parent {
    void print() {
        System.out.println("This is a Parent method");
        System.out.println("It has no parameters");
    }
}

class Child extends Parent {
    void print(String s) {

        System.out.println("This is a Child method");
        System.out.println("It has one parameter of type String contain " + s);
    }
}

public class methoverloadinheri {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
        c.print("MVGR");
    }

}
