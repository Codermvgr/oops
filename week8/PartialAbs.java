abstract class AbstractClass {
    abstract void AbstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method");
    }
}

public class PartialAbs extends AbstractClass {
    void AbstractMethod() {
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args) {
        PartialAbs obj = new PartialAbs();

        obj.nonAbstractMethod();

        obj.AbstractMethod();
    }
}
