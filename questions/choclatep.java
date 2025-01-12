package questions;

import java.util.Arrays;

public class choclatep {
    public static int packet(int[] arr, int m){
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int window = i+m-1;
            if(window>=arr.length){
                break;
                
            }
            int diff = arr[window]-arr[i];
            mindiff = Math.min(diff, mindiff);
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        System.out.println(packet(arr, m));
    }
    
}
