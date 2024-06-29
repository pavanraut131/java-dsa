public class linearsearch{
    public static void main(String[] args){
        int[] arr={1,2,34,5,6,8};
        System.out.println(find(arr,35,0));
    }
    public static boolean find(int[] arr, int target, int i){
        if(i==arr.length){
            return false;
        }       
        return arr[i]==target || find(arr,target,i+1);
    }

}