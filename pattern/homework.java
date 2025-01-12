package pattern;

import java.util.ArrayList;
import java.util.List;

public class homework {

    public static int hw(int threshold, List<Integer> points){
        for(int i=0; i<points.size()-1; i++){
            for(int j=i+1; j<points.size(); j++){
                if(points.get(j)-points.get(i)==threshold){
                    return j;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int threshold = 7;
        List<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(5);
        points.add(8);
        System.out.println(hw(threshold, points));

    }
    
}
