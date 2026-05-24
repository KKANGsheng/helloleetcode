class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) {
            return  0;
        }
        int maxLength =0;
        HashSet<Integer>hashSet = new HashSet<>();
        for(int num:nums) {
            hashSet.add(num);
        }
        for(int num:hashSet) {
            if(!hashSet.contains(num-1)) {
                int currentLength = 0;
                while(hashSet.contains(num)) {
                    num++;
                    currentLength++;
                }
                maxLength = Math.max(currentLength,maxLength);
            }
        }
        return maxLength;
    }
}