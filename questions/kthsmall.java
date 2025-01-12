package questions;


import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmall {
    public static int kthsmallest(int[] arr, int k){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            maxheap.add(arr[i]);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        return maxheap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 20, 15};
        int k=4;
        System.out.println(kthsmallest(arr, k));
    }
    
}
