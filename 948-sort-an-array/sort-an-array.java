class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>minHeap = new PriorityQueue<>();
        for (int num:nums) {
            minHeap.add(num);
        }
        int i=0;
        int [] result = new int [nums.length];

        while(minHeap.size()!=0) {
            result[i] = minHeap.poll();
            i++;
        }
        return result;
    }
}