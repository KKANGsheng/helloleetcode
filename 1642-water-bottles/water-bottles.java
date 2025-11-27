class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        int empty=0;
        int extra=0;

        while(numBottles>0){
            // Add all the number of Bottles first
            ans+=numBottles;
            // Calculate emptyBottles
            empty=numBottles+extra;
            // redefine the numBottles
            numBottles=empty/numExchange;
            // calculate extra bottles
            extra=empty%numExchange;
        }
        return ans;
    }
}