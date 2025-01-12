package pattern;

public class countvowel {
    public static void countvowelandconsonant(String str){
        str = str.toLowerCase();
        int vowelcount = 0;
        int consonantcount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelcount++;
            }else{
                consonantcount++;
            }
        }
        System.out.println("the vowel count is " +vowelcount);
        System.out.println("the consonant count is "+consonantcount);
    }
    public static void main(String[] args) {
        String str = "Hello World! This is a Test String.";
        countvowelandconsonant(str);
    }
    
}
