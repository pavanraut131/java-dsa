package pattern;

import java.util.Arrays;
import java.util.Scanner;

public class tripletsum {
    public static void findtriplets(int arr[], int targetsum){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int currentsum = arr[i] +arr[left] +arr[right];
                if(currentsum==targetsum){
                    System.out.println("triplet found" + "["+arr[i] +arr[left] +arr[right]+"]");
                    return;
                }
                  else  if(currentsum<targetsum){
                    left++;
                } else{
                    right--;
                }
            }
        }
        System.out.println("no triplet is found");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of elements of array :");
        int n = sc.nextInt();

        if(n<3){
            System.out.println("Array should have atleast 3 elements");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int targetsum = sc.nextInt();
        findtriplets(arr, targetsum);

    }
    
}
