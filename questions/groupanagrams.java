package questions;
import java.util.*;

public class groupanagrams {
    public static List<List<String>> groupanagram1(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupanagram1(strs));
    }
    
}
