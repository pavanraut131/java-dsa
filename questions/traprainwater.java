package questions;

public class traprainwater {
    public static int traprainwaterpr(int[] height){
        int left = 0;
        int right= height.length-1;
        int leftmax = height[left];
        int rigthmax = height[right];
        int trappedwater = 0;

        while(left<right){
            if(leftmax<rigthmax){
                left++;
                leftmax = Math.max(leftmax, height[left]);
                trappedwater+=leftmax-height[left];

            } else{
                right--;
                rigthmax = Math.max(rigthmax, height[right]);
                trappedwater+= rigthmax-height[right];
            }
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(traprainwaterpr(height));
    }
    
}
