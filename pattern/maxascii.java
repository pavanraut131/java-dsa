package pattern;

import java.util.Scanner;

public class maxascii {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        if(str.isEmpty()){
            System.out.println("the input String is empty");
        }
        char smallestchar = str.charAt(0);
        char largestchar = str.charAt(0);

        for(int i=0; i<str.length(); i++){
            char currentchar  = str.charAt(i);

            if(currentchar<smallestchar){
                smallestchar = currentchar;
            }
            if(currentchar>largestchar){
                largestchar = currentchar;
            }
        }
        System.out.println("the smallest ascii value is " + smallestchar);
        System.out.println("the largest ascii value for the string is " + largestchar);
    }
    
}
