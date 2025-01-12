package pattern;

public class num {
public static void main(String args[]){
    for(int i=1; i<=4; i++){
        for(int j=1; j<=5; j++){
            if(j==1){
                System.out.print(1);
            }
            else if(j==2||j==4){
                System.out.print(i);
            } else if(j==3){
                System.out.print(2);
            } else{
                System.out.print(3);
            }
        }
        System.out.println();
    }
}
    
}
