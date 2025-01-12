package questions;
public class removeconsequitivechar{
    public static String rcc(String s  ){
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(i==0 || s.charAt(i)!= s.charAt(i-1)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s  = "aabaa";
        System.out.println(rcc(s));

    }
}