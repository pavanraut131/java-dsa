package questions;

public class merge {
    public static boolean mergeString(String word1, String word2, String third){
        StringBuilder ans = new StringBuilder();
        int i=0; 
        int j=0;
        while(i<word1.length() && j<word2.length()){
            ans.append(word2.charAt(j++));
            ans.append(word1.charAt(i++));
        }
        if(j<word2.length()){
            ans.append(word2.substring(j));
        }
        if(i<word1.length()){
            ans.append(word1.substring(i));
        }
        return ans.toString().equals(third);
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "def";
        String third = "dabecf";

        System.out.println(mergeString(word1, word2, third));
    }
    
}
