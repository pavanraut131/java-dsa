package questions;

public class minrsa {
    public static int minrotatedsubarray(int[] arr){
        int minval = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(arr[start]<=arr[mid]){
                minval= Math.min(minval, arr[start]);
                start = mid+1;
            } else{
                minval = Math.min(minval, arr[mid]);
                end = mid-1;
            }
        }
        return minval;
    }
    
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};
        System.out.println(minrotatedsubarray(arr));
    }
    
}
