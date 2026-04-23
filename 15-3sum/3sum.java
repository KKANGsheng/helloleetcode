class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> result = new HashSet<>();
            for(int i=0;i<nums.length-2;i++){
                Set<Integer> seen= new HashSet<>();
                for(int j=i+1;j<nums.length;j++){
                    int complement= -nums[i]-nums[j];
                    if(seen.contains(complement)){
                        int a=nums[i];
                        int b=nums[j];
                        int c=complement;
                        List<Integer> list = Arrays.asList(a, b, c);
                        Collections.sort(list);
                        result.add(list);
                    }
                    seen.add(nums[j]);
                }
            }
            return new ArrayList<>(result);
        }
    }