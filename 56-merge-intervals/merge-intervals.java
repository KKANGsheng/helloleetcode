class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1) {
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> output_arr = new ArrayList<>();
        int [] current_interval = intervals[0];
        output_arr.add(current_interval);

        for (int[] interval:intervals) {
            int current_start = current_interval[0];
            int current_end   = current_interval[1];
            int next_start    = interval[0];
            int next_end      = interval[1];

            if(current_end>=next_start) {
                current_interval[1] = Math.max(current_end,next_end);
            } else {
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}