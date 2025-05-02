package Lesson5Task.Task2;

import java.util.Scanner;

public class Keperkernum {
    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        int square = n * n;
        int temp = square;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        for (int i = 1; i < count; i++) {
            int div = (int) Math.pow(10, i);
            int left = square / div;
            int right = square % div;

            if (right > 0 && left + right == n) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isKaprekar(n)) {
            System.out.println(n + " is a Kaprekar number");
        } else {
            System.out.println(n + " is not a Kaprekar number");
        }

        scanner.close();
    }
    
}
