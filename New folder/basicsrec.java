public class basicsrec {
        public static void Decr(int n){
            if(n==1){
                System.out.println(n);
                return;
            }
            
            Decr(n-1);
            System.out.print(n +" ");
        }
    public static void main(String[] args) {
        int n = 10;
        Decr(n);
    }
    
}
