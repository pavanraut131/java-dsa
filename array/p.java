package array;

class Solution {
    public static  boolean isPalindrome(int x) {
       if(x<0){
        return false;
       }
       int original = x;
        int res = 0;
        while(x>0){
            int remaninder = x%10;
            res = res*10 +remaninder;
            x= x/10;
        }
        if(res==original){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        int x= 121;
        System.out.println(isPalindrome(x));
    }
}
