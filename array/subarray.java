package array;

public class subarray {
    public static void printsubarray(int arr[]){
        int maxx = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum=0;
                
                for(int k=i; k<=j; k++){
                    
                    sum+=arr[k];
                }
                System.out.println(sum);
                if(maxx<sum){
                    maxx= sum;
            
                }
            }
        }
       System.out.println("the maxmimum of the subarray is " +maxx);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printsubarray(arr);
    }
    
}
