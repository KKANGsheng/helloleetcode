class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //dp starts from zero 
        int []dp = new int[cost.length+1];
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.min(cost[i-2]+dp[i-2],cost[i-1]+dp[i-1]);
        }
        return dp[cost.length];
    }
}