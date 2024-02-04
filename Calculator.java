import java.lang.System;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two numbers : ");
            float num1, num2;
            num1 = input.nextFloat();
            num2 = input.nextFloat();
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division ");
            System.out.print("Enter your choice : ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (choice == 4) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Invalid choice");
            }
        }

    }
}
