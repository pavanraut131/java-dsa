package array;

public class pairs {
    public static void printpairs(int arr[], int targetsum){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++ ){
                
                if(arr[i]+arr[j]==targetsum){
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
               
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6,8,10};
        int targetsum = 14;
        printpairs(arr, targetsum);
    }
    
}
