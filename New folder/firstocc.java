public class firstocc {
    public static int FirstOccurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return  FirstOccurence(arr, i+1, key );

    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.print(FirstOccurence(arr, 0, 5));
    }
    
}
