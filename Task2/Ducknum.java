package Lesson5Task.Task2;

import java.util.Scanner;

public class Ducknum {
    public static boolean DuckNumber(String num) {
        if (num.charAt(0) == '0') return false;

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        if (DuckNumber(num)) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is not a Duck number");
        }

        scanner.close();
    }
}
