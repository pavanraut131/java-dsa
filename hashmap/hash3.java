package hashmap;

import java.util.LinkedHashMap;

public class hash3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("Pakistan", 20);

        System.out.println(lhm);
    }
}
