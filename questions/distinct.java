package questions;

import java.util.Arrays;
import java.util.HashSet;

public class distinct {
    // public static int removeduplicate(int[] num){
    //     Arrays.sort(num);
    //     int index= 0;
    //     for(int i=1; i<num.length; i++){
    //         if(num[i]!=num[index]){
    //             num[index] = num[i];
    //             index++;
    //         }
    //     }
    //     return index;
    // }
    public static void main(String[] args) {
        int[] num={4, 3, 2, 5, 6, 7,3, 4, 2, 1};
        // System.out.println(removeduplicate(num));

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println(set.size());
    }
    
}
