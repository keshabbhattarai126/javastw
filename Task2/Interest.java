package Lesson5Task.Task2;

import java.util.Scanner;

public class Interest {
    public static double compoundinterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = scanner.nextDouble();

        System.out.print("Enter rate: ");
        double r = scanner.nextDouble();

        System.out.print("Enter time: ");
        double t = scanner.nextDouble();

        double interest = compoundinterest(p, r, t);
        System.out.println("Compound Interest: " + interest);

        scanner.close();
    }
    
}
