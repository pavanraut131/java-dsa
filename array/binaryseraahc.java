package array;

import pattern.number;

public class binaryseraahc {
    public static int binaryserach(int numbers[], int key){
        int start= 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]== key){
                return mid;
            } 
            if(numbers[mid]>key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 8, 16, 43};
        int key = 16;

        System.out.println("the index for binaryserach is" + binaryserach(numbers, key));
    }
    
}
