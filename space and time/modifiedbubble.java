public class modifiedbubble{
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void bubble(int arr[]){
        boolean swapped = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                if(swapped == false){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
         bubble(arr);
         printarr(arr);
    }
}