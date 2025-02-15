class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();

        for(int i=0;i<nums.length();i++){
            int compliment=target-nums[i];
            if(hashmap.containsKey(compliment)){
                return new int[]{hashmap.get(compliment),i};
            }
            hashmap.put(nums[i],i);
        }

    return new int[]{};
    }
}