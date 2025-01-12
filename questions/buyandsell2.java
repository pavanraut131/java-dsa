package questions;

public class buyandsell2 {
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int profit =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i-1]> prices[i]){
                profit+= prices[i-1]-min;
                min = prices[i];
            }
        }
        profit+=prices[prices.length-1]-min;
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
    
}
