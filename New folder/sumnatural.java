public class sumnatural {
    public static int  Sum(int n){
        if(n==0){
            return 0;
        }
        int s = n + Sum(n-1);
        return s;

    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(Sum(n));
    }
    
}
