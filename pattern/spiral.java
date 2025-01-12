package pattern;

import java.util.Scanner;


public class spiral {
    public static void print(int[][] matrix, int rows, int columns){
       int top= 0; int bottom = rows-1; int left =0; int right = columns-1;

       while(top<=bottom && left<=right){
        for(int i=left; i<=right; i++){
            System.out.print(matrix[top][i] + " ");
        }
        top++;
        for(int i=top; i<=bottom; i++){
            System.out.print(matrix[i][right] +" ");
        }
        right--;
        if(top<=bottom){
            for(int i=right; i>=left; i--){
                System.out.print(matrix[bottom][i] +" ");
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                System.out.print(matrix[i][left] +" ");
            }
            left++;
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("enter the no columns");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
         System.out.println("enter the elements of matrix");
         for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
         }
         System.out.println("the spiral matrix is :");
         print(matrix, rows, columns);
        
        
    }
    
}
