package Lesson5Task.Task2;

import java.util.Scanner;

public class Countcase {
    public static void countcases(String text) {
        int upper = 0, lower = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        countcases(input);

        scanner.close();
    }
    
}
