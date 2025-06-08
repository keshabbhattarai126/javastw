package Lesson5Task.ArrayTask;

import java.util.Scanner;

public class SpecificValue {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int[] array1 = new int[5];
        int len = array1.length;
        boolean searchValue=false;

        System.out.println("Enter numbers in array");

         for (int i=0; i<len-1;i++){
            
            array1[i]=sc.nextInt();
        }

        System.out.println("Enter a specific value to search");
        int specificValue = sc.nextInt();

        for (int i =0;i<len-1;i++){
            if(array1[i]==specificValue){
                searchValue = true;
            }
        }
        if(searchValue==true){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        sc.close();
        

    }
}
