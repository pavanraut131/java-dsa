package pattern;

import java.util.Arrays;

public class anagram {
    public static boolean isanagram(String str1, String str2){
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        System.out.println(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isanagram(str1, str2));
    }
    
}
