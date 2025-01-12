package questions;

public class buyandsell {
    public static int maxProfit(int[] prices ){
        int min= prices[0];
        int maxprofit = 0;

        for(int i=1; i<prices.length; i++){
            int profit  = prices[i]-min;
            maxprofit = Math.max(maxprofit, profit);
            min = Math.min(prices[i], min);
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    
}
