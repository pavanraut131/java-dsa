package questions;
import java.util.Arrays;

public class lcp {
    public static String loncomprefix(String[] strs){
        Arrays.sort(strs);
        StringBuilder ans= new StringBuilder(" ");
        String start = strs[0];
        String end= strs[strs.length-1];

        for(int i=0; i<Math.min(start.length(), end.length());i++){
            if(start.charAt(i)==end.charAt(i)){
                ans.append(start.charAt(i));
            } else{
                return ans.toString();
            }
        }
        return ans.toString();
    }
public static void main(String[] args) {
    String[] strs = {"dog","racecar","car"};
    System.out.println(loncomprefix(strs));
}
}
