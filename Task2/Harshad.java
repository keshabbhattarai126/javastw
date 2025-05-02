package Lesson5Task.Task2;

import java.util.Scanner;

public class Harshad {
    static void harshad(int a){
        int original = a;
        int sum=0;
        while (a!=0){
            sum+= a%10;
            a/=10;
        }
        if(original%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check Harshad ");
        int number = sc.nextInt();
        harshad(number);
        sc.close();
    }
    
}
