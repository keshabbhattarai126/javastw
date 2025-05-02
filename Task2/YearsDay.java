package Lesson5Task.Task2;

import java.util.Scanner;

public class YearsDay {
    static void daysconversion(int a){
        int years=a/365;
        int months=(a-(years*365))/30;
        int days = a - (years*365 + months*30);

        
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
        

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to conevert to years month days ");
        int number = sc.nextInt();
        daysconversion(number);
        sc.close();

    }
    
}
