class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minProfit){
                minProfit=prices[i];
            }
            if(prices[i]-minProfit>maxProfit){
                maxProfit=prices[i]-minProfit;
            }
        }
        return maxProfit;
    }
}