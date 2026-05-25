class Solution {
    public int maxProduct(int[] nums) {
    int result    = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];

    for (int i=1;i<nums.length;i++) {
        int n = nums[i];
        int a = n;
        int b = a * currentMax;
        int c = a * currentMin;

        currentMax = Math.max(a,Math.max(b,c));
        currentMin = Math.min(a,Math.min(b,c));

        result = Math.max(result,currentMax);
    }
    return result;
  }
}