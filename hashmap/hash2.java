package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class hash2 {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Inida", 100);
        hm.put("Pakistan", 50);

        ArrayList<String> keys = hm.keySet();

        for(String k:keys){
            System.out.println(k);
        }
    }
}
