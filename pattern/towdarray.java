package pattern;

import java.util.Scanner;

public class towdarray {
    public static void calabsdiff(int[][] arr, int rows, int columns){
     int rowsum = 0;
     int columnsum = 0;

     for(int i=0; i<rows; i++){
        for(int j=0; j<columns; j++){
            if(i==0 && i==rows-1){
                rowsum += arr[i][j];
            }else if(j==0 && j==columns-1){
                columnsum+= arr[i][j];
            }
        }
     }
     int difference= Math.abs(rowsum-columnsum);

     System.out.println("the diffrence is " + difference);

     
     
     
     
        // int evensumd = 0;
        // int oddsum = 0;

        // for(int i=0; i<n; i++){
        //     int element  = arr[i][i];
        //     if(element%2==0){
        //         evensumd += element*element;
        //     } else{
        //         oddsum += element*element;
        //     }
        // }
        // int difference  = Math.abs(evensumd-oddsum);
        // System.out.println("the diffrerence is " +difference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = sc.nextInt();
        System.out.println("enter the coloumns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements of matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        calabsdiff(arr, rows, columns);
    }
    
}
