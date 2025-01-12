package questions;

public class maxpro {
    public static int maxprosubarray(int[] nums){
        int maxprod = Integer.MIN_VALUE;
        int product = 1;
        for(int i=0; i<nums.length; i++){
            product*=nums[i];
            maxprod = Math.max(maxprod, product);
            if(product==0){
                product=1;
            }
        }
        product=1;
        for(int i=nums.length-1; i>=0; i--){
            product*=nums[i];
            maxprod = Math.max(maxprod, product);
            if(product==0){
                product=1;
            }
        }
        return maxprod;
    }
    public static void main(String[] args) {
        int[] nums= {2,3,-2,4};
        System.out.println(maxprosubarray(nums));
    }
    
}
