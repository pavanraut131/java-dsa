package functions;
public class prime {
    public static boolean isprime(int num){
       if(num==2){
        return true;
       }
       for(int i=2; i<=Math.sqrt(num); i++){
        if(num%i==0){
            return false;
        }
       }
       return true;
    }
    public static void printinrange(int n){
            for(int i=2; i<n; i++){
                if(isprime(i)){
                    System.out.println(i);
                }
            }
        }

    public static void main(String[] args) {
        // int num = 9;
        // System.out.println(isprime(num));
        printinrange(20);
    }
    
}
