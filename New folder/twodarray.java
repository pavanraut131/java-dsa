import java.util.*;
public class twodarray {
    public static int sumdiagonal(int[][] matrix, int n, int m){
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    sum += matrix[i][j];
                } else if(i+j==n-1){
                    sum+= matrix[i][j];
                }
            }
        }
       
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = new int[4][4];
        int n = matrix.length,   m = matrix[0].length;;
       
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            };
        };
        System.out.println(sumdiagonal(matrix, n, m));
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] +" ");
        //     };
        //     System.out.println();
        // };
    };
};
