package questions;

import java.util.ArrayList;

public class removeelement {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    
}
