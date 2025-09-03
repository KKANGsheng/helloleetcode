class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> arrayList =new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            arrayList.add(index[i],nums[i]);
        }

        int []result=new int[arrayList.size()];

        for(int j=0;j<arrayList.size();j++){
            result[j]=arrayList.get(j);
        }
        
        return result;

    }
}