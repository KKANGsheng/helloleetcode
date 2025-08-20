class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int [] result= new int[k];
        int index=0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
    PriorityQueue<Map.Entry<Integer, Integer>> heap =
    new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        heap.add(entry);
        if(heap.size()>k){
            heap.poll();
        }
    }

    while(!heap.isEmpty()){
        result[index++]=heap.poll().getKey();
    }


        return result;
    }
}