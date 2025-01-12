package pattern;

public class hollowrohmbus {

    public static void hollow_rombus(int n){
        for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        hollow_rombus(5);
    }
    
}
