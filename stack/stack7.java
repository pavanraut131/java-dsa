package stack;
import java.util.*;

public class stack7 {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack sc= new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(6);

        while(!sc.isempty()){
            System.out.println(sc.peek());
            sc.pop();
        }
    }
    
}
