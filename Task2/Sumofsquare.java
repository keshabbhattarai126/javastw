package Lesson5Task.Task2;

import java.util.Scanner;

public class Sumofsquare {
    public static int sumsq(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = sumsq(n);
        System.out.println("Sum of squares of digits: " + result);

        scanner.close();
    }
    
}
