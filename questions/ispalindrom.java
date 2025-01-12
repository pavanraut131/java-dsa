package questions;

public class ispalindrom {
    public static boolean palindrm(String str){
        String[] parts = str.replaceAll("[^a-zA-Z0-9]", "").split("\\s+");

        String nstr = String.join("", parts).toLowerCase();

        int start=0;
        int end = nstr.length()-1;

        while (start<end) {
            if(nstr.charAt(start)!=nstr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(palindrm(str));
    }
    
}
