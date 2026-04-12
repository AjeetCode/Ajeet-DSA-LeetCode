class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyingPrice=prices[0];
        for(int num:prices){
            if(num < buyingPrice){
                buyingPrice=num;
            }
            if(num > buyingPrice){
                int x=num-buyingPrice;
                profit=Math.max(x,profit);
            }
        }
        return profit;

        
    }
}