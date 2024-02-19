import java.lang.System;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = input.nextInt();
        evenodd(num);
        input.close();
    }

    public static void evenodd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a Even number");
        } else {
            System.out.println(num + " is a Odd number");
        }
    }
}
