public class tiling {
    public static int Tilingprb(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        int verticalways = Tilingprb(n-1);
        int horizontalways = Tilingprb(n-2);
        return verticalways + horizontalways;
    }
    public static void main(String[] args) {
        int n= 3;
        System.out.println(Tilingprb(4));
    }
    
}
