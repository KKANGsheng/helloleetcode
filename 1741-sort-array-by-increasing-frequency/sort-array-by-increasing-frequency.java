class Solution {
    public int[] frequencySort(int[] nums) {
           // Step 1: Count frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        // Step 2: Convert to Integer[] for custom sort
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Step 3: Sort by custom rule
        Arrays.sort(arr, (a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa == fb) return b - a; // same frequency → larger number first
            return fa - fb; // smaller frequency first
        });

        // Step 4: Convert back to int[]
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}