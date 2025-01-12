package pattern;



public class hollowpattern {

    public static void hollow_pattern(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*"+ " ");
                }else{
                    System.out.print("");
                }
                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hollow_pattern(4, 5);   
    }
}
