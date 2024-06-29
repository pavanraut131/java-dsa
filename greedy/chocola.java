package greedy;

import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String [] args){
        int n=4, m=6;
        Integer costvert[] = {2, 1, 3, 1, 4};
        Integer costhor[] = {4, 1, 2};
        Arrays.sort(costvert, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h=0, v=0;
        int vp=1, hp=1;
        int cost = 0;

        while(h < costhor.length && v < costvert.length){
            if(costvert[v]<= costhor[h]){
                cost += (costhor[h]*vp);
                hp++;
                h++;
            } else{
                cost += (costvert[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost += (costhor[h]*vp);
                hp++;
                h++;
        }
        while(v<costvert.length){
            cost += (costvert[v]*hp);
            vp++;
            v++;
        }

        System.out.println("the min cost of making of the pieces is :"+ cost);
    }
    
}
