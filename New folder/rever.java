import java.util.Scanner;

public class rever {
    public static String reverse(String num){
        boolean isNegative = num.charAt(0)=='-';
        if(isNegative){
            num = num.substring(1);
        }
         
        StringBuilder reversed = new StringBuilder("");

        for(int i=num.length()-1; i>=0; i--){
            reversed.append(num.charAt(i));
        }
        String reversednum = reversed.toString().replace("0", "");
        if(isNegative){
            reversednum = '-' + reversednum;
        }

        return reversednum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        String num = sc.nextLine();
        System.out.println(reverse(num));
    }
    
}
