class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>>minHeap=
        new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        int []result =new int[k];

        // Store All the frequency
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        for(int i=0;i<k;i++){
            result[i]=minHeap.poll().getKey();
        }

        return result;

    }
}