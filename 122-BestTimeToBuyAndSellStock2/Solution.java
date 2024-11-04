class Solution {
    public int maxProfit(int[] prices) {
        int profit_atual = 0;
        int profit_total = 0;
        int l = 0;
        int r = 1;

        while(r < prices.length){
            if(prices[r] > prices[r-1]){
                profit_atual = prices[r] - prices[l];
            }
            else{
                profit_total += profit_atual;
                profit_atual = 0;
                l = r;
            }
            r++;
        }

        profit_total += profit_atual;

        return profit_total;
    }
}