package hashmap;

import java.util.HashSet;

public class hash6 {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(5);
        // set.add(3);
        // set.add(1);

        // System.out.println(set);

        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        HashSet<Integer> set = new HashSet<>();

        for(int i= 0; i<num.length; i++){
            set.add(num[i]);
        }

        System.out.println(set.size());
    }
    
}
