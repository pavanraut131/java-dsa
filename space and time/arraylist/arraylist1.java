package arraylist;
import java.util.*;

public class arraylist1{
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(6);
        list.add(10);
        list.add(4);
        list.add(5);
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
           
        //     if(max < list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.print(max);

        int indx1 =2, indx2 =4;
        swap(list, indx1, indx2);
        System.out.print(list);


    }
}
    

