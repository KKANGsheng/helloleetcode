class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        hashMap.put(0,1);

        for (int num:nums) {
            prefixSum+=num;
            if (hashMap.containsKey(prefixSum-k)){
                count+=hashMap.get(prefixSum-k);
            }
            hashMap.put(prefixSum,hashMap.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}