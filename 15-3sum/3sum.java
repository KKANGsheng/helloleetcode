class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>seen = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int complement = -nums[i]-nums[j];
                if(seen.contains(complement)){
                    int a = nums[i];
                    int b= nums[j];
                    int c= complement;
                    List<Integer> arrayList = new ArrayList<>();
                    arrayList.add(a);
                    arrayList.add(b);
                    arrayList.add(c);
                    Collections.sort(arrayList);
                    result.add(arrayList);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}