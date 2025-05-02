package Lesson5Task.Task2;

import java.util.Scanner;

public class Reveseinteger {
    public static int reversenum(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int reversed = reversenum(n);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
    
}
