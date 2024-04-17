public class BoxingUnboxing {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        // Boxing
        int i = 10;
        Integer boxed = Integer.valueOf(i);
        System.out.println("Boxed integer: " + boxed);

        // Unboxing
        Integer j = new Integer(20);
        int unboxed = j.intValue();
        System.out.println("Unboxed integer: " + unboxed);

        // Autoboxing
        int k = 100;
        Integer autoBoxed = k;
        System.out.println("Autoboxed integer: " + autoBoxed);

        // Auto-unboxing
        Integer l = new Integer(200);
        int autoUnboxed = l;
        System.out.println("Auto-unboxed integer: " + autoUnboxed);

    }
}
