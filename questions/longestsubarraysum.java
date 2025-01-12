package questions;

public class longestsubarraysum {
    public static int longestsubarraydivide(int[] arr, int k){
        int maxsub = 0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum%k==0){
                    maxsub = Math.max(maxsub, j-i+1);
                }
               
            }
        }
        return maxsub;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 2, -5, 12, -11, -1, 7};
        int k=3;
        System.out.println(longestsubarraydivide(arr, k));
    }
    
}
