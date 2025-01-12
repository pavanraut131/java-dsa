package string;

public class string3 {
    public static String substring(String str, int sti, int endi){
        String substr ="";
        for(int i=sti; i<endi; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println(substring(str, 0, 4));
    }
    
}
