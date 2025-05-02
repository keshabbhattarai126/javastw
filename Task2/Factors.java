package Lesson5Task.Task2;

import java.util.Scanner;

public class Factors {
    public static void factorsnum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Factors of " + n + ": ");
        factorsnum(n);

        scanner.close();
    }
    
}
