package Lesson5Task.Task2;

import java.util.Scanner;

public class Swapvar {
    public static void Swapvariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        Swapvariable(a, b);

        scanner.close();
    }
    
}
