class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer,Integer>entry:hashMap.entrySet()) {
            if (entry.getValue()>1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}