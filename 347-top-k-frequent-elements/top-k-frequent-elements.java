class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hashMap.get(a)-hashMap.get(b));
    for (int i=0;i<nums.length;i++) {
        hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
    }
    for (int num:hashMap.keySet()) {
        pq.add(num);
        if (pq.size()>k) {
            pq.poll();
        }
    }
    int[] result = new int[k];
    for (int i=0;i<k;i++) {
        result[i]=pq.poll();
    }
    return result;
 }
}