public class Exceptions {
    public static void main(String[] args) {
        // Checked Exceptions

        try {
            Class.forName("Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

        // Unchecked Exceptions
        try {
            int[] a = { 1, 2, 3, 4, 5 };
            System.out.println(a[10]); // Accessing out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.equals("Str")); // Null pointer access
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            int d = 10 / 0; // Arithmetic exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}

