package questions;

public class missingnumbeer {
    public static int misn(int[] arr){
        int n= arr.length;

        int expectedsum = (n*(n+1))/2;
        int currentsum = 0;
        for(int i=0; i<arr.length; i++){
            currentsum+=arr[i];
        }
        int res= expectedsum-currentsum;
        return res;

    }
    public static void main(String[] args) {
        int[] arr =  {0,1};
        System.out.println(misn(arr));
    }
}
