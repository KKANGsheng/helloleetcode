class Solution {
    public int maxSubArray(int[] nums) {
    int currentSum = 0 ;
    int maxSum  = Integer.MIN_VALUE;

    for (int i=0;i<nums.length;i++) {
        currentSum = Math.max(nums[i],nums[i]+currentSum);
        maxSum = Math.max(maxSum,currentSum);
    }
    return maxSum;
 }
}