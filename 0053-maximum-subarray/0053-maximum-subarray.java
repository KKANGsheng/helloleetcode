class Solution {
    public int maxSubArray(int[] nums) {
        int maxSumSoFar=nums[0];
        int currentMaxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currentMaxSum=Math.max(nums[i],currentMaxSum+nums[i]);
            maxSumSoFar=Math.max(currentMaxSum,maxSumSoFar);
        }

        return maxSumSoFar;
    }
}