package questions;

public class removechr {
    public static String removechar(String str, char ch){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=ch){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "pavan";
        char ch = 'a';
        System.out.println(removechar(str, ch));
    }
    
}
