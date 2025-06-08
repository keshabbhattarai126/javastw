package Lesson5Task.ArrayTask;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int len = array1.length;
        int arraySum =0;

        System.out.println("Enter numbers in array");

         for (int i=0; i<len-1;i++){
            
            array1[i]=sc.nextInt();
        }

        for (int i =0;i<len-1;i++){
            arraySum+= array1[i];
        }

        System.out.println("The sum of array elements is"+" "+arraySum);
        sc.close();
        
    }
    
}
