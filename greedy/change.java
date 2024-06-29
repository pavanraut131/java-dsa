package greedy;

public class change {
    public static void main(String [] args){
        int coin[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};

        int amount = 590;
        int count = 0;

        for(int i=0; i<coin.length; i++){
            if(coin[i]<amount){
               while(coin[i]<=amount){
                count++;
                amount -= coin[i];

               }
            }
        }
        System.out.println("the maximum coins used for making the change is" + count);
    }
    
}
