package questions;

import java.util.HashMap;
import java.util.Set;

public class majority {
    public static int majorityele(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        Set<Integer> keys=  map.keySet();

        for(int key : keys){
            if(map.get(key)>nums.length/2){
                return key;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityele(nums));
    }
    
}
