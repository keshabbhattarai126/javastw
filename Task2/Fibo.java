package Lesson5Task.Task2;

import java.util.Scanner;

public class Fibo {
    public static void fiboser(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        System.out.print("Fibonacci series: ");
        fiboser(n);

        scanner.close();
    }
    
}
