class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>numSet = new HashSet<>();
        int longest=0;

        for(int num:nums){
            numSet.add(num);
        }

        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;

                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}