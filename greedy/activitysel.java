package greedy;
import java.util.ArrayList;
public class activitysel {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxact = 1;
        int lastend = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i]>=lastend){
                maxact++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println("max activites are: "+ maxact);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
    
}
