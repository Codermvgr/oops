import java.lang.*;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String name = input.next();
            System.out.println("Hello " + name);
        }
    }
}
