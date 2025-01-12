package questions;

import java.util.HashSet;
import java.util.Set;

public class lswrc {
    public static int longestsubwrep(String s){
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxlength= 0;
        for(int right=0; right<s.length(); right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlength = Math.max(maxlength, right-left+1);
            } else {
                while(s.charAt(left)!= s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String s= "abcabcbb";
        System.out.println(longestsubwrep(s));
    }
    
}
