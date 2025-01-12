package questions;
class countprimes {
    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
       int  count =0;
        for(int i=2; i<n; i++){
            if(isprime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=15;
        System.out.print(countPrimes(n));
        // System.out.println(isprime(n));
    }
}
