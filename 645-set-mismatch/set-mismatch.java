class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int []result = new int[2];

        for (int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                result[0] =nums[i];
            }
            set.add(nums[i]);
        }

        for (int j=1;j<=nums.length;j++) {
            if (!set.contains(j)) {
                result[1]= j;
            }
        }
        return result;
    }
}