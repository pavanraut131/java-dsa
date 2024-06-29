public class binary {
    public static void binarycon(int n, String str, int lastplace){
        if(n==0){
            System.out.println(str);
            return;
        }
        binarycon(n-1, str+'0', 0);
        if(lastplace == 0){
            binarycon(n-1, str+'1', 1);
        }
    }
    public static void main(String[] args) {
        binarycon(3, new String(""), 0);
    }
    
}
