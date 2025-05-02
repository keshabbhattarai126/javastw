package Lesson5Task.Task2;

import java.util.Scanner;

public class Oddnum {
    static void oddnum(int a){

        for(int i=1;i<=a;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        oddnum(number);
        sc.close();

    }
    
}
