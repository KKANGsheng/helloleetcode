class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int result     = nums[0];

        for (int i=1;i<nums.length;i++) {
            int n = nums[i];

            int a = n;
            int b = currentMax * a;
            int c = currentMin * a;

            int newMax = Math.max(a,Math.max(b,c));
            int newMin = Math.min(a,Math.min(b,c));
            currentMax = newMax;
            currentMin = newMin;

            result = Math.max(result,currentMax);
        }
        return result;
    }
}