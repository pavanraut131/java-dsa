public class quick2 {
    public static void quicsort(int arr[], int si, int ei){
        if(si>=ei){
            return ;
        }
        int q = partition( arr,  si, ei);
        quicsort(arr, si, q-1);
        quicsort(arr, q+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i=si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {10,80, 30, 90, 40, 50, 70};
        quicsort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
