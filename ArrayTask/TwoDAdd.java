package Lesson5Task.ArrayTask;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] twoDArray = new int[2][3];
        int[][] twoDArray2 = new int[2][3];
        int [][] resultArray =new int [2][3];

        int rowLength = twoDArray.length;
        int rowLength2 = twoDArray2.length;

        int columnLength = twoDArray[0].length;
        int columnLength2 = twoDArray2[0].length;
        
        System.out.println("Enter value inside first 2x3 matrix");

        for (int i=0; i<rowLength;i++){
            for(int j=0; j<columnLength;j++){
                twoDArray[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter value inside second 2x3 matrix");


        for (int i=0; i<rowLength2;i++){
            for(int j=0; j<columnLength2;j++){
                twoDArray2[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<rowLength;i++){
            for(int j=0; j<columnLength;j++){
                resultArray[i][j] = twoDArray[i][j]+twoDArray2[i][j];

            }
        }
        
    }
    
}
