import java.lang.System;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer : ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is a Even number");
            } else {
                System.out.println(num + " is a Odd number");
            }
        }
    }
}
