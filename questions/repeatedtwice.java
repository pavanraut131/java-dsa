package questions;

import java.util.HashMap;
import java.util.Set;

public class repeatedtwice {
    public static void repeat(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keys = map.keySet();

        for(int k: keys){
            if(map.get(k)==1){
                System.out.println(k);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        repeat(arr);
    }
    
}
