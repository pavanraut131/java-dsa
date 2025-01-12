package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static List<List<Integer>> threesum1(int[] arr){
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            int lp = i+1;
            int rp = arr.length-1;

            while(lp<rp){
                if(arr[i]+arr[lp]+arr[rp]==0){
                    result.add(Arrays.asList(arr[i], arr[lp], arr[rp]));
                }else if(arr[i]+arr[lp]+arr[rp]<0){
                    lp++;
                }else{
                    rp--;
                }
                lp++;
                rp--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1};
        List<List<Integer>> result = threesum1(arr);
        // for(List<Integer> triplet: result){
        //     System.out.println(triplet);
        // }
        System.out.println(result);
       
    }
    
}
