package questions;
public class nextper {
    public static void nextpermutation(int[] nums){
        if(nums.length<=1){
            return;
        }

        int i= nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }

            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    public static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 7, 6};
        nextpermutation(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
    
}
