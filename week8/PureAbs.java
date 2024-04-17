interface Interface {
    void AbstractMethod();
}

public class PureAbs implements Interface {
    public void AbstractMethod() {
        System.out.println("This method implements the abstract method of the interface.");
    }

    public static void main(String[] args) {
        PureAbs obj = new PureAbs();
        obj.AbstractMethod();
    }

}
