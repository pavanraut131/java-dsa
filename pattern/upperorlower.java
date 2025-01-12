package pattern;

public class upperorlower {
    public static void countupperorlower(String str){
        int upcount = 0;
        int lowercount = 0;
        for(int i= 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upcount++;
            } else if(Character.isLowerCase(ch)){
                lowercount++;
            }
        }
        System.out.println("the count of upper case letters is " +upcount);
        System.out.println("the count of lowercase is " +lowercount);
        
    }
    public static void main(String[] args) {
        String str = "Hello World! This is a Test String.";
        countupperorlower(str);
    }
    
}
