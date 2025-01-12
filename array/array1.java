package array;
import java.util.*;

public class array1 {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+1);
        }
    }
    public static void main(String[] args) {
      
      int marks[] = {98, 99, 34};
      update(marks);
      
        // int marks[]  = new int[100];

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();

        // System.out.println("physics marks"+ marks[0]);
        // System.out.println("chemistry" +marks[1]);
    }
    
}
