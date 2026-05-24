class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }
        HashSet<Integer>hashSet = new HashSet<>();
        int maxLength=0;
        
        for (int num:nums) {
            hashSet.add(num);
        }

        for(int num:hashSet) {
            if(!hashSet.contains(num-1)) {
                int currentLength = 1;
                while(hashSet.contains(num+1)) {
                    num++;
                    currentLength++;
                }
                maxLength = Math.max(currentLength,maxLength);
            }
        }
        return maxLength;
    }
}