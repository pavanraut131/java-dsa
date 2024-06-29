public class array1{
    public static void main(String[] args){
        int[] array={1,3,4,5,8,9};
        System.out.println(sorted(array,0));
    }
    public static boolean sorted(int[] array, int index){
        if(index ==array.length-1){
            return true;
        }
        return array[index] < array[index+1] && sorted(array, index+1);
    }
}