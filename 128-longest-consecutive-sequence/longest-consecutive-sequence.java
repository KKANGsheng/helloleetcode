class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        HashSet<Integer>hashSet=new HashSet<>();

        for(int num:nums){
            hashSet.add(num);
        }

        int maxLengthSequence=0;

        for(int numbers:hashSet){
            if(!hashSet.contains(numbers-1)){
                int currentSequence=1;

                while(hashSet.contains(numbers+1)){
                    currentSequence++;
                    numbers++;
                }
             maxLengthSequence=Math.max(maxLengthSequence,currentSequence);
            }
        }
        return maxLengthSequence;
 }
}
