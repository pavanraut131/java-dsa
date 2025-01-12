package questions;

public class minoperations {
    public static int minopforpalindrom(int[] arr){
        int n= arr.length-1;
        int lp = 0;
        int rp = n;
        int ans =0;

        while(lp<=rp){
            if(arr[lp]==arr[rp]){
                lp++;
                rp--;
            } else if(arr[lp]<arr[rp]){
               lp++;
               arr[lp]+=arr[lp-1];
               ans++;
                
            } else{
                rp--;
                arr[rp]+=arr[rp+1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {11, 14, 15, 99};
        System.out.println(minopforpalindrom(arr));
    }
    
}
