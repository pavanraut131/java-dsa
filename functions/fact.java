package functions;

public class fact {
    public static int bc(int n, int r){
        int res = factorial(n)/(factorial(r)*factorial(n-r));
        return res;
    }
    public static int factorial(int n){
       if(n==0){
        return 1;
       }

       return n*factorial(n-1);
    }
    public static void main(String[] args) {
        // int n=6;
        // System.out.println(factorial(n));
        System.out.println(bc(5, 2));
    }
}
