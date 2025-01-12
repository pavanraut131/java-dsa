package questions;
import java.util.*;

public class duplicatecharacters{
    public static void dc(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        Set<Character> key = map.keySet();
        for(Character c : key){
            if(map.get(c)>1){
                System.out.println(c +" -> " + map.get(c));
            }
        }

    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        dc(s);
    }

}