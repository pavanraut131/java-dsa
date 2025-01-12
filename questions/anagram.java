package questions;

import java.util.HashMap;

public class anagram {
    public static boolean isanagram(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);

                if(map.get(t.charAt(i))==0){
                    map.remove(t.charAt(i));
                }
            }else{
                return false;
            }
        }
        if(map.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "knee";
        String t = "keen";
        System.out.println(isanagram(s, t));

        
    }
    
}
