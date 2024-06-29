package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("Us", 50);
        hm.put("China", 150);

        // System.out.println(hm);
        // System.out.println(hm.get("China"));
        // System.out.println(hm.containsKey("india"));
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key"+" "+k+", value"+" "+hm.get(k));
            
        }
    }
    
}
