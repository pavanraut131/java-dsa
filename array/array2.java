package array;

public class array2 {
    public static void linearserach(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("the index of the key is "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7};
        int key = 5;

        linearserach(arr, key);
    }
    
}
