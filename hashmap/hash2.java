package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hash2 {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Inida", 100);
        hm.put("Pakistan", 50);

        Set<String> keys = hm.keySet();

        for(String k:keys){
            System.out.println(k);
        }
    }
}
