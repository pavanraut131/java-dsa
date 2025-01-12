package array;
import java.util.*;
public class array3 {

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nubers[] = {1, 4, 5, 6, 8};
        System.out.println("the largest value is" + getlargest(nubers));
    }
}
