public class fact {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.print(Fact(n));
    }
    
}
