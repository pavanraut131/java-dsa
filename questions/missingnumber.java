package questions;

import java.util.Arrays;



public class missingnumber {
    public static int mn(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1!=nums[i+1]){
                return nums[i]+1;
            }
        }   
        return nums[nums.length-1]+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(mn(nums));
    }
    
}
