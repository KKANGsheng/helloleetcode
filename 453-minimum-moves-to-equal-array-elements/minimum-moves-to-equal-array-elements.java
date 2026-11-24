class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];

        for (int num:nums) {
            min= Math.min(num,min);
        }
        int move =0;

        for (int num:nums) {
            move+=num-min;
        }
        return move;
    }
}