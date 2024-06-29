public class fibo {
        public static int fibon(int n){
            if(n==0 || n==1){
                return n;
            }
            int fn = fibon(n-1) + fibon(n-2);
            return fn;
        }
    public static void main(String[] args) {
        int n= 10;
        System.out.println(fibon(n));
    }
    
}
