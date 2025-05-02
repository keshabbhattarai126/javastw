package Lesson5Task.Task2;

import java.util.Scanner;

public class Swapnum {
    public static void swapnumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        swapnumbers(a, b);

        scanner.close();
    }
}
