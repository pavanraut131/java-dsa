import java.util.*;
public class array{

        public static int linerasearch(int marks[], int key){
            for(int i=0; i<=marks.length; i++){
                if(marks[i]==key){
                    return i;
                };
                
            };
            return -1;
        };


    public static void main(String [] args){
        int marks[] = {10, 3, 4, 88, 34};
        int key = 4;
         int index= linerasearch(marks, key);
         System.out.println("The element is found to be on the index "+index);
    }







    // public static void update(int marks[]){
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] = marks[i] + 1;
    //     };
    // };
    // public static void main(String[] args){
    //     int marks[] = { 99, 49, 89};
    //     update(marks);
    //     for(int i=0; i<marks.length; i++){
    //         System.out.print(marks[i]+" ");
    //     }
        

        // Scanner sc= new Scanner(System.in);
        
        //  marks[0] = sc.nextInt();
        //  marks[1] = sc.nextInt();
        //  marks[2] = sc.nextInt();

        // System.out.println("phy:" + marks[0]);
        // System.out.println("che:" + marks[1]);
        // System.out.println("maths:" + marks[2]);
    }
