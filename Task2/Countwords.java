package Lesson5Task.Task2;

import java.util.Scanner;

public class Countwords {
    public static int countWordsBySpaces(String input) {
        input = input.trim();
        if (input.isEmpty()) return 0;

        int noofwords = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != ' ' && input.charAt(i - 1) == ' ') {
                noofwords++;
            }
        }
        return noofwords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine(); 

        int noofwords = countWordsBySpaces(text);
        System.out.println("Number of words: " + noofwords); 

        scanner.close(); 
    }
}
