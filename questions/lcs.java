package questions;

import java.util.Arrays;

public class lcs {

    public static int sequnce(int[] nums){
        Arrays.sort(nums);
        
        int idx = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1==nums[i+1]){
                idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(sequnce(nums));
    }
}