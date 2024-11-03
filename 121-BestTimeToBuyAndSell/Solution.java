public class Solution {
    public int maxProfit(int[] prices){
        int profit_max = 0;
        int profit_atual = 0;
        int i = 0;
        int j = 0;

        while(j < prices.length){
            if(prices[j] > prices[i]){
                profit_atual = prices[j] - prices[i];
                if(profit_atual > profit_max){
                    profit_max = profit_atual;
                }
            }
            else{
                i = j;
            }
            j++;
        }
        return profit_max;
    }
    
}
