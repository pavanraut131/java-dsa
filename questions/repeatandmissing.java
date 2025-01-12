package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class repeatandmissing {
    public static ArrayList<Integer> rm(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int reapeting  = -1;
        int missingnumber = -1;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]==arr[i]){
               reapeting= arr[i];
            }
        }
        int expectedsum = (n* (n+1))/2;
        int actualsum = 0;
        for(int nums: arr){
            actualsum += nums;
        }
        missingnumber = expectedsum-(actualsum-reapeting);

        list.add(reapeting);
        list.add(missingnumber);
        
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(rm(arr));
    }
}
