package Lesson5Task.Task2;

import java.util.Scanner;

public class Asciival {
    public static int getAsciiValue(char ch) {
        return (int) ch;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int ascii = getAsciiValue(ch);
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        scanner.close();
}
}
