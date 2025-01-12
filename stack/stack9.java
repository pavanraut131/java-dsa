package stack;
import java.util.*;
public class stack9 {
    public static void main(String[] args) {
        int arrr[]  = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextgret[] = new int[arrr.length];

        for(int i=arrr.length-1; i>=0; i--){
            while(!s.isEmpty() && arrr[s.peek()]<=arrr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgret[i] = -1;
            }else{
                nextgret[i] = arrr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0; i<=nextgret.length; i++){
            System.out.println(nextgret[i]+" ");
        }
    }
    
}
