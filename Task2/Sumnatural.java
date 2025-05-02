package Lesson5Task.Task2;

import java.util.Scanner;

public class Sumnatural {
    public static int sumnatural(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = sumnatural(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        scanner.close();
    }
    
}
