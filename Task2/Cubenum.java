package Lesson5Task.Task2;

import java.util.Scanner;

public class Cubenum {
    
        public static int Cubeofnum(int n) {
            return n * n * n;
        }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int cube = Cubeofnum(n);
        System.out.println("Cube of " + n + ": " + cube);

        scanner.close();
    }
    
}
