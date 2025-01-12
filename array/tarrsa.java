package array;

import java.util.ArrayList;

public class tarrsa {
    public static boolean targetinsortroted(ArrayList<Integer> list, int target){
      int i=-1;
      int n = list.size();
      for(int j=0; i<n; j++){
        if(list.get(j)>list.get(j+1)){
          i=j;
          break;
        }
      }
      int lp = i+1;
      int rp = i;

      while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        } else if(list.get(lp)+list.get(rp)< target){
            lp = (lp+1)%n;
        } else{
            rp = (n + rp-1)%n;
        }
      }
      return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(targetinsortroted(list, target));
    }
    
}