package string;

public class string4 {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am pavan";
        System.out.println(touppercase(str));
    }
    
}
