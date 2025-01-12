public class x {
    public static void print( int n){
       
        System.out.println(n);
         if(n>1){
           
            print(n-1); 
        }
       
        
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
